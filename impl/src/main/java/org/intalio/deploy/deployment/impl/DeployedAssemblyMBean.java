package org.intalio.deploy.deployment.impl;

import org.intalio.deploy.deployment.DeployedAssembly;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource
public class DeployedAssemblyMBean {
    private DeployedAssembly assembly;
	
	public DeployedAssemblyMBean(DeployedAssembly assembly) {
		this.assembly = assembly;
	}
	
	@ManagedAttribute
	public String getName() {
		return assembly.getAssemblyId().getAssemblyName();
	}
	
	@ManagedAttribute
	public int getVersion() {
		return assembly.getAssemblyId().getAssemblyVersion();
	}
	
	@ManagedAttribute
	public String getPath() {
		return assembly.getAssemblyDir();
	}
}
