package org.intalio.deploy.deployment.impl.clustering;

import java.io.Serializable;

import org.intalio.deploy.deployment.DeployedAssembly;

public class UndeployedMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    public DeployedAssembly assembly;

    public UndeployedMessage(DeployedAssembly assembly) {
        this.assembly = assembly;
    }
}
