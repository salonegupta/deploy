/**
 * Copyright (c) 2005-2014 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Intalio inc. - initial API and implementation
 */
package org.intalio.deploy.deployment.spi;

import java.io.File;

import org.intalio.deploy.deployment.ComponentId;

/**
 * @author himanshu
 *
 */
public interface ComponentManagerExtended extends ComponentManager {

    /**
     *
     * Deploys a new assembly component.
     * <p>
     * If the activate parameter is set to true, the version specified by the component id is activated
     * after a successful deployment.
     * <p>
     * In a clustered environment, this method is called on a single node (the coordinator).
     * The ComponentManager must validate the component for consistency and must take any necessary
     * step in order to successfully deploy this component.
     * <p>
     * If the ComponentManager is unable to deploy the component, it should return ERROR-level
     * messages with an appropriate description of the issue.
     *
     * @param name Component identifier
     * @param path Component root directory
     * @param deployedResources resources that were deployed by the component manager for this component
     * @param activate indicates that the assembly containing this component is the default(active) version
     * @param user indicates the user who has deployed the process
     * @return the result from the component manager
     */
    ComponentManagerResult deploy(ComponentId name, File path, boolean activate, String user);
}
