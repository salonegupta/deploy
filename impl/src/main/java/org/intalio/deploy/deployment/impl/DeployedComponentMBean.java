package org.intalio.deploy.deployment.impl;

import org.intalio.deploy.deployment.DeployedComponent;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource
public class DeployedComponentMBean {
    private DeployedComponent component;
    
    public DeployedComponentMBean(DeployedComponent component) {
        this.component = component;
    }
    
    @ManagedAttribute
    public String getBundleName() {
        return String.valueOf(component.getComponentId());
    }

    @ManagedAttribute
    public String getComponentManager() {
        return String.valueOf(component.getComponentManagerName());
    }
}