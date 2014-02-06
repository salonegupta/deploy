package org.intalio.deploy.deployment.impl.clustering;

import static org.intalio.deploy.deployment.impl.LocalizedMessages._;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

import com.sun.enterprise.ee.cms.core.CallBack;
import com.sun.enterprise.ee.cms.core.GMSConstants;
import com.sun.enterprise.ee.cms.core.GMSFactory;
import com.sun.enterprise.ee.cms.core.GroupHandle;
import com.sun.enterprise.ee.cms.core.GroupManagementService;
import com.sun.enterprise.ee.cms.core.MessageSignal;
import com.sun.enterprise.ee.cms.core.Signal;
import com.sun.enterprise.ee.cms.impl.client.FailureNotificationActionFactoryImpl;
import com.sun.enterprise.ee.cms.impl.client.FailureSuspectedActionFactoryImpl;
import com.sun.enterprise.ee.cms.impl.client.JoinNotificationActionFactoryImpl;
import com.sun.enterprise.ee.cms.impl.client.MessageActionFactoryImpl;
import com.sun.enterprise.ee.cms.impl.client.PlannedShutdownActionFactoryImpl;
import com.sun.enterprise.ee.cms.impl.common.JoinNotificationSignalImpl;

@ManagedResource(objectName="intalio:module=DeploymentService,service=Cluster")
public class QuorumBasedCluster implements CallBack, Cluster {
    private static final Logger LOG = LoggerFactory.getLogger(QuorumBasedCluster.class);

    public static final String DEPLOY_SERVER_ID_PROP = "org.intalio.deploy.serverId";
    
    public static final String DEPLOY_COMPONENT = "DeploymentService";
    
    private GroupManagementService gms;

    private String serverId = "server-" + UUID.randomUUID();
    
    private String groupName = null;
    
    private Properties clusterProperties = new Properties();

    private Integer clusterSize = 1;
    
    private ClusterListener listener = new NullClusterListener();
    
    @ManagedAttribute
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @ManagedAttribute
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Properties getClusterProperties() {
        return clusterProperties;
    }

    public void setClusterProperties(Properties clusterProperties) {
        this.clusterProperties = clusterProperties;
    }

    public ClusterListener getListener() {
        return listener;
    }

    public void setListener(ClusterListener listener) {
        if( listener == null ) {
            listener = new NullClusterListener(); 
        }
        
        this.listener = listener;
    }

    @ManagedAttribute
    public boolean isCoordinator() {
        String groupLeader = null;
        
        try {
            groupLeader = gms.getGroupHandle().getGroupLeader();
        } catch( NullPointerException e ) {
            if( LOG.isDebugEnabled() ) LOG.debug("Shoal failed resolving group leader, this is ignorable during startup.");
        }
        
        if( LOG.isDebugEnabled() ) {
            LOG.debug( "Members in cluster: " + gms.getGroupHandle().getAllCurrentMembers());
            LOG.debug("My server id: " + serverId);
            LOG.debug(_("Coordinator: {0}", groupLeader));
        }

        return isClusterReady() &&  serverId.equals(groupLeader);
    }

    @ManagedAttribute
    public int getClusterSize() {
        return clusterSize;
    }

    public void setClusterSize(int clusterSize) {
        this.clusterSize = clusterSize;
    }

    public void start() {
        try {
            resolveServerId();
            LOG.info(_("Starting cluster lifecycle manager: serverId={0} groupName={1}", serverId, groupName));

            gms = (GroupManagementService) GMSFactory.startGMSModule(serverId, groupName, 
                    GroupManagementService.MemberType.CORE, clusterProperties);
            gms.addActionFactory(new JoinNotificationActionFactoryImpl(this));
            gms.addActionFactory(new FailureSuspectedActionFactoryImpl(this));
            gms.addActionFactory(new FailureNotificationActionFactoryImpl(this));
            gms.addActionFactory(new PlannedShutdownActionFactoryImpl(this));
            gms.addActionFactory(new MessageActionFactoryImpl(this), DEPLOY_COMPONENT);
            gms.join();
            LOG.info(_("Coordinator: {0}", isCoordinator()));
            LOG.info(">>> gms members : " + gms.getGroupHandle().getAllCurrentMembers() + " for " + gms.getGroupHandle().getCurrentCoreMembers());
            synchronized( clusterSize ) {
                while( !isClusterReady() ) {
                    clusterSize.wait(1000);
                    warmUp();
                }
            }
        } catch (Exception e) {
            LOG.error("Error while starting cluster lifecycle manager", e);
        }
    }
    
    void resolveServerId() {
        String serverIdOverrideFromJVM = System.getProperty(DEPLOY_SERVER_ID_PROP);
        if( serverIdOverrideFromJVM != null && 
                (serverIdOverrideFromJVM = serverIdOverrideFromJVM.trim()).length() > 0) {
            serverId = serverIdOverrideFromJVM;
            LOG.info(_("Server Id has been overridden by the JVM property: {0}", serverIdOverrideFromJVM));
        }
    }
    
    public void shutdown() {
        gms.shutdown(GMSConstants.shutdownType.INSTANCE_SHUTDOWN);
    }
    
    @ManagedOperation
    public void warmUp() {
        try {
            LOG.debug("Warming up cluster...");
            gms.getGroupHandle().sendMessage("Component", ("WARM_UP from " + serverId).getBytes());
        } catch( Exception e ) {
            throw new RuntimeException(e);
        }
    }

    public void processNotification(Signal signal) {
        try {
            signal.acquire();
            try {
                if (signal instanceof MessageSignal) {
                    if (signal.getMemberToken() != null)
                        LOG.info(_("Cluster message received from {0}: {1}", signal.getMemberToken(), signal.toString()));
                    else 
                        LOG.info(_("Cluster message received: {0}", signal.toString()));

                    Object obj = deserialize(((MessageSignal) signal).getMessage());
                    if (obj instanceof DeployedMessage) {
                        DeployedMessage msg = (DeployedMessage) obj;
                        listener.onDeployed(msg.assembly, msg.activate);
                    } else if (obj instanceof UndeployedMessage) {
                        UndeployedMessage msg = (UndeployedMessage) obj;
                        listener.onUndeployed(msg.assembly, false);
                    } else if (obj instanceof RetiredMessage) {
                        RetiredMessage msg = (RetiredMessage) obj;
                        listener.onRetired(msg.assembly);
                    } else if (obj instanceof ActivatedMessage){
                        ActivatedMessage msg = (ActivatedMessage) obj;
                        listener.onActivated(msg.assembly);
                    } else {
                        LOG.error(_("Unknown cluster message received: {0}", obj.toString()));
                    }
                } else if( signal instanceof JoinNotificationSignalImpl ){
                    LOG.info(_("Join Notification received from {0}: {1}", signal.getMemberToken(), signal.toString()));
                    JoinNotificationSignalImpl joinNotif = (JoinNotificationSignalImpl)signal;
                    LOG.info( "New member: " + joinNotif.getMemberToken());
                    LOG.info( "Members in cluster: " + gms.getGroupHandle().getAllCurrentMembers());
                    LOG.info(_("Coordinator: {0}", isCoordinator()));
                    
                    synchronized(clusterSize) {
                        clusterSize.notify();
                    }
                } else {
                    LOG.info(_("Notification received from {0}: {1}", signal.getMemberToken(), signal.toString()));
                    LOG.info(_("Coordinator: {0}", isCoordinator()));
                }
            } finally {
                try {
                    signal.release();
                } catch (Exception e) {
                    LOG.error("Error releasing cluster notification", e);
                }
            }
        } catch (Exception e) {
            LOG.error("Error processing cluster notification", e);
        }
    }

    public void sendMessage(Serializable obj) {
        String msgName = obj.getClass().getSimpleName();
        LOG.debug(_("Sending cluster message: {0}", msgName));
        try {
            GroupHandle gh = gms.getGroupHandle();
            gh.sendMessage(DEPLOY_COMPONENT, serialize(obj));
        } catch (Exception e) {
            LOG.error(_("Error while sending cluster message: {0}", msgName), e);
        }
    }
    
    public List<String> getCurrentMembers() {
        return gms.getGroupHandle().getCurrentCoreMembers();
    }

    private byte[] serialize(Serializable obj) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
        ObjectOutputStream out = new ObjectOutputStream(bos) ;
        out.writeObject(obj);
        out.close();
        return bos.toByteArray();
    }
    
    private Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
        Object obj = in.readObject();
        in.close();
        return obj;
    }

    @ManagedAttribute
    private boolean isClusterReady() {
        return gms.getGroupHandle().getCurrentCoreMembers().size() > clusterSize / 2;
    }
    
    @ManagedAttribute
    public int getNumberOfCurrentMembers() {
        return gms.getGroupHandle().getCurrentCoreMembers().size();
    }
    
    @ManagedAttribute
    public String getActiveMembers() {
        return String.valueOf(getCurrentMembers());
    }

    @ManagedAttribute
    public String getInactiveMembers() {
    	Collection<String> members = new ArrayList<String>();
    	
    	members.addAll(gms.getGroupHandle().getAllCurrentMembers());
    	members.removeAll(getCurrentMembers());
    	
        return String.valueOf(members);
    }
}