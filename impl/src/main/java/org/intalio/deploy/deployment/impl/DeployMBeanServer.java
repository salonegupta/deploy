package org.intalio.deploy.deployment.impl;

import org.intalio.deploy.deployment.AssemblyId;
import org.intalio.deploy.deployment.ComponentId;
import org.intalio.deploy.deployment.DeployedAssembly;
import org.intalio.deploy.deployment.DeployedComponent;

public interface DeployMBeanServer {
    public void registerAssembly(DeployedAssembly assembly);
    
    public void unregisterAssembly(AssemblyId aid);
    
    public void registerComponent(DeployedAssembly assembly, DeployedComponent component);
    
    public void unregisterComponent(String managerName, ComponentId cid);

    public class NullDeployMBeanServer implements DeployMBeanServer {
        public void registerAssembly(DeployedAssembly assembly) {
            // do nothing
        }
        
        public void unregisterAssembly(AssemblyId aid) {
            // do nothing
        }
        
        public void registerComponent(DeployedAssembly assembly, DeployedComponent component) {
            // do nothing
        }
        
        public void unregisterComponent(String managerName, ComponentId cid) {
            // do nothing
        }
    }
}
