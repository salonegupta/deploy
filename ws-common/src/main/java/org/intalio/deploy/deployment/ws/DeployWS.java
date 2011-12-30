/**
 * Copyright (c) 2007-2010 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Intalio inc. - initial API and implementation
 */

package org.intalio.deploy.deployment.ws;

import static org.intalio.deploy.deployment.ws.DeployWSConstants.ACTIVATE;
import static org.intalio.deploy.deployment.ws.DeployWSConstants.ASSEMBLY_NAME;
import static org.intalio.deploy.deployment.ws.DeployWSConstants.ASSEMBLY_VERSION;
import static org.intalio.deploy.deployment.ws.DeployWSConstants.ZIP;
import static org.intalio.deploy.deployment.ws.DeployWSConstants.PROCESS_NAME;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.intalio.deploy.deployment.AssemblyId;
import org.intalio.deploy.deployment.DeployedAssembly;
import org.intalio.deploy.deployment.DeploymentResult;
import org.intalio.deploy.deployment.impl.DeploymentServiceImpl;
import org.intalio.deploy.deployment.impl.clustering.Cluster;
import org.intalio.deploy.deployment.impl.clustering.NullClusterListener;
import org.intalio.deploy.deployment.utils.DeploymentServiceLookup;
import org.intalio.deploy.registry.Registry;
import org.intalio.deploy.registry.RegistryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Deployment Web Service: handles marshalling/unmarshalling of requests to DeploymentServiceImpl.
 */
public class DeployWS {
    private static final Logger LOG = LoggerFactory.getLogger(DeployWS.class);

    public static final String CONFIG_DIR_PROPERTY = "org.intalio.deploy.configDirectory";
    
    private static DeployWS _instance;
    
    private File _configDir;

    DeploymentServiceImpl _deployService;
    
    public DeployWS() {
        this(true);
    }

    public DeployWS(boolean bindRegistry) {
        initialize();
        if (bindRegistry) bindRegistry();
    }
    
    protected void initialize() {
        try {
            synchronized (DeployWS.class) {
                if (_instance != null)
                    return;
                LOG.debug("Initializing configuration.");
                String configDir = System.getProperty(CONFIG_DIR_PROPERTY);
                if (configDir == null) {
                    throw new RuntimeException("System property " + CONFIG_DIR_PROPERTY + " not defined.");
                }
                _configDir = new File(configDir);
                if (!_configDir.exists()) {
                    throw new RuntimeException("Configuration directory " + _configDir.getAbsolutePath()
                            + " doesn't exist.");
                }
                ClassLoader oldClassLoader = Thread.currentThread().getContextClassLoader();
                Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
                try {
                    Collection<String> configPaths = new HashSet<String>(); 

                    File jmxConfigFile = new File(_configDir, "jmx.xml");
                    if( jmxConfigFile.exists() ) {
                        configPaths.add(String.valueOf(jmxConfigFile.toURI()));
                    }
                    File clusterConfigFile = new File(_configDir, "cluster-config.xml");
                    if( clusterConfigFile.exists() ) {
                        configPaths.add(String.valueOf(clusterConfigFile.toURI()));
                    }
                    
                    configPaths.add(String.valueOf(new File(_configDir, "deploy-service.xml").toURI()));
                    
                    FileSystemXmlApplicationContext factory = new FileSystemXmlApplicationContext(configPaths.toArray(new String[] {}));
                    if (_deployService != null) {
                        _deployService.stop();
                    }
                    _deployService = (DeploymentServiceImpl) factory.getBean("deploymentService");

                    if( LOG.isDebugEnabled() ) LOG.debug("MBeanServer used: " + _deployService.getDeployMBeanServer());
                    
                    Cluster cluster = null;
                    try {
                        cluster = (Cluster) factory.getBean("clusterConfig");
                    } catch( NoSuchBeanDefinitionException nsbde ) {
                        // not defined
                    }
                    
                    if( cluster != null ) {
                        if( LOG.isInfoEnabled() ) LOG.info("Found clustering configuration at:" + configPaths + ".");
                        
                        if( cluster.getListener() instanceof NullClusterListener ) {
                            cluster.setListener(_deployService);
                        }
                        
                        _deployService.setCluster(cluster);
                    }
                    
                    _deployService.init();
                    _deployService.start();
                    _instance = this;
                } finally {
                    Thread.currentThread().setContextClassLoader(oldClassLoader);
                }
            }
        } catch (RuntimeException except) {
            LOG.error("Error during initialization of deployment service", except);
            throw except;
        } catch( Exception e ) {
            LOG.error("Error during initialization of deployment service", e);
            throw new RuntimeException(e);
        }
    }
    
    protected void bindRegistry() {
        try {
            DeploymentServiceLookup lookup = new DeploymentServiceLookup();
            lookup.loadProperties();

            RegistryFactory registryFactory = new RegistryFactory();
            registryFactory.init();
            Registry registry = registryFactory.getRegistry();
            
            LOG.info("Registering DeploymentService at "+lookup.deploymentServiceName);
            registry.bind(lookup.deploymentServiceName, _deployService);

            LOG.info("Registering DeploymentServiceCallback at "+lookup.deploymentCallbackName);
            registry.bind(lookup.deploymentCallbackName, _deployService.getCallback());
        } catch (RuntimeException except) {
            LOG.error("Error during initialization of deployment service", except);
            throw except;
        } catch (Exception except) {
            LOG.error("Error during initialization of deployment service", except);
            throw new RuntimeException(except);
        }
    }
    
    private void checkInitialized() {
        if (_instance == null) {
            throw new IllegalStateException("Deployment service not initialized");
        }
    }

    public OMElement deployAssembly(OMElement requestEl) throws AxisFault {
        checkInitialized();
        OMParser request = new OMParser(requestEl);
        String assemblyName = request.getRequiredString(ASSEMBLY_NAME);
        boolean activate = request.getOptionalBoolean(ACTIVATE, true);
        InputStream zip = request.getInputStream(ZIP);
        DeploymentResult result = _deployService.deployAssembly(assemblyName, zip, activate);
        return OMParser.marshallDeploymentResult(result);
    }
    
    public OMElement undeployAssembly(OMElement requestEl) throws AxisFault {
        checkInitialized();
        OMParser request = new OMParser(requestEl);
        String assemblyName = request.getRequiredString(ASSEMBLY_NAME);
        int assemblyVersion = request.getRequiredInt(ASSEMBLY_VERSION);
        AssemblyId aid = new AssemblyId(assemblyName, assemblyVersion);
        DeploymentResult result = _deployService.undeployAssembly(aid);
        return OMParser.marshallDeploymentResult(result);
    }

    public OMElement getDeployedAssemblies(OMElement requestEl) throws AxisFault {
        checkInitialized();
        Collection<DeployedAssembly> assemblies = _deployService.getDeployedAssemblies();
        return OMParser.marshallGetDeployedAssemblies(assemblies);
    }

    public OMElement activate(OMElement requestEl) throws AxisFault {
        checkInitialized();
        OMParser request = new OMParser(requestEl);
        String assemblyName = request.getRequiredString(ASSEMBLY_NAME);
        int assemblyVersion = request.getRequiredInt(ASSEMBLY_VERSION);
        AssemblyId aid = new AssemblyId(assemblyName, assemblyVersion);
        DeploymentResult result = _deployService.activate(aid);
        return OMParser.marshallDeploymentResult(result);
    }
    
    public OMElement activateProcess(OMElement requestEl) throws AxisFault {
        checkInitialized();
        OMParser request = new OMParser(requestEl);
        String assemblyName = request.getRequiredString(ASSEMBLY_NAME);
        int assemblyVersion = request.getRequiredInt(ASSEMBLY_VERSION);
        AssemblyId aid = new AssemblyId(assemblyName, assemblyVersion);
        String processName = request.getRequiredString(PROCESS_NAME);
        DeploymentResult result = _deployService.activateProcess(aid, processName);
        return OMParser.marshallDeploymentResult(result);
    }


    public OMElement retire(OMElement requestEl) throws AxisFault {
        checkInitialized();
        OMParser request = new OMParser(requestEl);
        String assemblyName = request.getRequiredString(ASSEMBLY_NAME);
        AssemblyId aid = new AssemblyId(assemblyName);
        DeploymentResult result = _deployService.retire(aid);
        return OMParser.marshallDeploymentResult(result);
    }
    
    public OMElement retireAssembly(OMElement requestEl) throws AxisFault {
        checkInitialized();
        OMParser request = new OMParser(requestEl);
        String assemblyName = request.getRequiredString(ASSEMBLY_NAME);
        int assemblyVersion = request.getRequiredInt(ASSEMBLY_VERSION);
        AssemblyId aid = new AssemblyId(assemblyName,assemblyVersion);
        DeploymentResult result = _deployService.retireAssembly(aid);
        return OMParser.marshallDeploymentResult(result);
    }
    
    public OMElement retireProcess(OMElement requestEl) throws AxisFault {
        checkInitialized();
        OMParser request = new OMParser(requestEl);
        String assemblyName = request.getRequiredString(ASSEMBLY_NAME);
        int assemblyVersion = request.getRequiredInt(ASSEMBLY_VERSION);
        String processName = request.getRequiredString(PROCESS_NAME);
        AssemblyId aid = new AssemblyId(assemblyName,assemblyVersion);
        DeploymentResult result = _deployService.retireProcess(aid,processName);
        return OMParser.marshallDeploymentResult(result);
    }

    /**
     * @return the current instance of DeployWS.
     */
    public static DeployWS getInstance() {
        return _instance;
    }
    
    /**
     * Stops the deployment listener.
     */
    public void stop() {
        _deployService.stop();
        _instance = null;
    }
}
