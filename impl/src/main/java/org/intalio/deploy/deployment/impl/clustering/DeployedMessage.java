package org.intalio.deploy.deployment.impl.clustering;

import java.io.Serializable;

import org.intalio.deploy.deployment.DeployedAssembly;

public class DeployedMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public DeployedAssembly assembly;
    public boolean activate;

    public DeployedMessage(DeployedAssembly assembly, boolean activate) {
        this.assembly = assembly;
        this.activate = activate;
    }
}