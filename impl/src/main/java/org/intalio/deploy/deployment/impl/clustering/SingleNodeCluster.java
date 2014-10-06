package org.intalio.deploy.deployment.impl.clustering;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A cluster implementation using the NullObject pattern.
 * 
 * @author sean
 *
 */
public class SingleNodeCluster implements Cluster {
    private static final Logger LOG = LoggerFactory.getLogger(SingleNodeCluster.class);

    private List<String> members = new ArrayList<String>();
    
    public SingleNodeCluster() {
        members.add("SingleNodeServer");
    }
    
    public String getServerId() {
        return "SingleNodeServer";
    }

    public void start() {
        // do nothing
    }
    
    public void shutdown() {
        // do nothing
    }
    
    public void sendMessage(Serializable obj) {
        // do nothing
    }
    
    public boolean isCoordinator() {
        if( LOG.isDebugEnabled() ) LOG.debug("Coordinator is true when the SingleNodeCluster is used.");
        return true;
    }
    
    public void warmUp() {
        // do nothing
    }
    
    public List<String> getCurrentMembers() {
        return members;
    }

    public ClusterListener getListener() {
        return null;
    }

    public void setListener(ClusterListener listener) {
        // do nothing
    }

    public String getGroupName() {
        return null;
    }

    public void setGroupName(String groupName) {
        // do nothing
    }
}
