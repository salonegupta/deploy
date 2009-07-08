package org.intalio.deploy.deployment.impl.clustering;

import org.intalio.deploy.deployment.DeployedAssembly;

public class NullClusterListener implements ClusterListener {
    public void onActivated(DeployedAssembly assembly) {
    }

    public void onDeployed(DeployedAssembly assembly, boolean activate) {
    }

    public void onRetired(DeployedAssembly assembly) {
    }

    public void onUndeployed(DeployedAssembly assembly) {
    }
};
