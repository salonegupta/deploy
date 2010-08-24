package org.intalio.deploy.deployment.impl;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.intalio.deploy.deployment.AssemblyId;
import org.intalio.deploy.deployment.ComponentId;
import org.intalio.deploy.deployment.DeployedAssembly;
import org.intalio.deploy.deployment.DeployedComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.UnableToRegisterMBeanException;

public class DefaultDeployMBeanServer implements DeployMBeanServer, ApplicationContextAware {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultDeployMBeanServer.class);

    private ApplicationContext context;
    
    private boolean reRegisterIfExists = true;
    
    public void setReRegisterIfExists(boolean reRegisterIfExists) {
        this.reRegisterIfExists = reRegisterIfExists;
    }

    private MBeanExporter getMBeanExporter() {
    	return (MBeanExporter)context.getBean("exporter");
    }

    public void registerAssembly(DeployedAssembly assembly) {
        MBeanExporter exporter = null;
        ObjectName name = null;
        Object managedObject = null;
        try {
            exporter = getMBeanExporter();
            name = getAssemblyObjectName(assembly.getAssemblyId());
            
            LOG.debug("Registering " + name);
            managedObject = new DeployedAssemblyMBean(assembly);
            exporter.registerManagedResource(managedObject, name);
            LOG.debug("Registered " + name);
        } catch(UnableToRegisterMBeanException utrme) {
            handleUnableToRegisterMBeanException(utrme, managedObject, name, exporter);
        } catch(Exception mone) {
            LOG.error("", mone);
        }
    }

    public void unregisterAssembly(AssemblyId aid) {
        MBeanExporter exporter = null;
        try {
            exporter = getMBeanExporter();
            ObjectName name = getAssemblyObjectName(aid);
            LOG.debug("Unregistering " + name);
            exporter.getServer().unregisterMBean(name);
            LOG.debug("Unregistered " + name);
        } catch(Exception e) {
            LOG.error("", e);
        }
    }

    public void registerComponent(DeployedAssembly assembly, DeployedComponent component) {
        MBeanExporter exporter = null;
        ObjectName name = null;
        Object managedObject = null;
        try {
            exporter = getMBeanExporter();
            name = getComponentObjectName(component.getComponentManagerName(), component.getComponentId());

            LOG.debug("Registering " + name);
            managedObject = new DeployedComponentMBean(component);
            exporter.registerManagedResource(managedObject, name);
            LOG.debug("Registered " + name);
        } catch(UnableToRegisterMBeanException utrme) {
            handleUnableToRegisterMBeanException(utrme, managedObject, name, exporter);
        } catch(Exception mone) {
            LOG.error("MBean is disabled due to an error: ", mone);
        }
    }

    private void handleUnableToRegisterMBeanException(UnableToRegisterMBeanException utrme,
            Object managedObject, ObjectName name, MBeanExporter exporter) {
        if( utrme.getRootCause() != null && 
                (utrme.getRootCause() instanceof InstanceAlreadyExistsException) &&
                reRegisterIfExists ) {
            try {
                // unregister existing one and start a new one
                LOG.debug("Unregistering the existing " + name + " instance.");
                exporter.getServer().unregisterMBean(name);
                exporter.registerManagedResource(managedObject, name);
                LOG.debug("Re-registered " + name + ".");
            } catch( Exception e2 ) {
                LOG.error("Re-binding failed ", e2);
            }
        } else {
            LOG.error("MBean is disabled due to an error: ", utrme);
        }
    }
    
    public void unregisterComponent(String managerName, ComponentId cid) {
        MBeanExporter exporter = null;
        try {
            exporter = getMBeanExporter();
            ObjectName name = getComponentObjectName(managerName, cid);
            LOG.debug("Unregistering " + name);
            exporter.getServer().unregisterMBean(name);
            LOG.debug("Unregistered " + name);
        } catch(Exception e) {
            LOG.error("", e);
        }
    }

    private ObjectName getAssemblyObjectName(AssemblyId aid) throws MalformedObjectNameException {
        String name = aid.getAssemblyName();
        int version = aid.getAssemblyVersion();
        String objectName = "intalio:module=DeploymentService,deployed=bundles,bundle=" + name + ",version=" + version + ",package=_package";
        
        return new ObjectName(objectName);
    }

    private ObjectName getComponentObjectName(String managerName, ComponentId cid) throws MalformedObjectNameException {
        String name = cid.getAssemblyId().getAssemblyName();
        int version = cid.getAssemblyId().getAssemblyVersion();
        String objectName = "intalio:module=DeploymentService,deployed=bundles,bundle=" + name + ",version=" + version + ",componentId=" + cid.getComponentName() + "." + managerName;
        
        return new ObjectName(objectName);
    }

    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context = context;
    }
}
