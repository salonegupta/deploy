package org.intalio.deploy.deployment.impl;

import static org.intalio.deploy.deployment.impl.LocalizedMessages._;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.intalio.deploy.deployment.ComponentId;
import org.intalio.deploy.deployment.DeploymentMessage;
import org.intalio.deploy.deployment.spi.ComponentManager;
import org.intalio.deploy.deployment.spi.ComponentManagerResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.intalio.deploy.deployment.impl.DeploymentServiceImpl.*;

/**
 * The null-object pattern-ed ComponentManager implementation.
 * 
 * @author sean
 *
 */
class MissingComponentManager implements ComponentManager {
    private static final Logger LOG = LoggerFactory.getLogger(DeploymentServiceImpl.class);

    String _componentType;

    public MissingComponentManager(String componentType) {
        _componentType = componentType;
    }

    List<DeploymentMessage> message(DeploymentMessage msg) {
        List<DeploymentMessage> msgs = new ArrayList<DeploymentMessage>();
        msgs.add(msg);
        return msgs;
    }

    public void initialize(ComponentId name, File path, List<String> deployedResources, boolean active) {
        LOG.warn(_("Missing component manager: activate {0} {1}", name, path));
    }

    public void dispose(ComponentId cid, File path, List<String> deployedResources, boolean active) {
        LOG.warn(_("Missing component manager: deactivate {0}", cid));
    }

    public void deployed(ComponentId cid, File path, List<String> deployedResources, boolean active) {
        LOG.warn(_("Missing component manager: deployed {0}", cid));
    }

    public String getComponentManagerName() {
        return _componentType;
    }

    public void start(ComponentId cid, File path, List<String> deployedResources, boolean active) {
        LOG.warn(_("Missing component manager: start {0}", cid));
    }

    public void stop(ComponentId cid, File path, List<String> deployedResources, boolean active) {
        LOG.warn(_("Missing component manager: stop {0}", cid));
    }

    public void undeploy(ComponentId cid, File path, List<String> deployedObjects) {
        LOG.warn(_("Missing component manager: undeploy {0}", cid));
    }

    public void undeployed(ComponentId cid, File path, List<String> deployedResources) {
        LOG.warn(_("Missing component manager: undeploy {0}", cid));
    }

	public void activate(ComponentId cid, File path, List<String> deployedResources) {
        LOG.warn(_("Missing component manager: undeploy {0}", cid));
	}

	public ComponentManagerResult deploy(ComponentId name, File path, boolean activate) {
        String msg = _("No component manager for component type {0}", _componentType);
        return new ComponentManagerResult(message(error(msg)));
	}

	public void retire(ComponentId cid, File path, List<String> deployedResources) {
        LOG.warn(_("Missing component manager: undeploy {0}", cid));
	}

	public void activated(ComponentId cid, File path, List<String> deployedResources) {
        LOG.warn(_("Missing component manager: undeploy {0}", cid));
	}

	public void retired(ComponentId cid, File path, List<String> deployedResources) {
        LOG.warn(_("Missing component manager: undeploy {0}", cid));
	}
}