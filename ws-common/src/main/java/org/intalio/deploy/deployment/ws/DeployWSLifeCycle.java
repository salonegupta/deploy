/**
 * Copyright (c) 2007-2008 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Intalio inc. - initial API and implementation
 *
 * Date         Author             Changes
 * Jan 16, 2010      Antoine Toulme     Created
 */
package org.intalio.deploy.deployment.ws;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.engine.ServiceLifeCycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A handler to manage the lifecycle of the deployment service.
 *
 *
 * @author <a href="http://www.intalio.com">Intalio Inc.</a>
 * @author <a href="mailto:atoulme@intalio.com">Antoine Toulme</a>
 */
public class DeployWSLifeCycle implements ServiceLifeCycle {

    private static final Logger LOG = LoggerFactory.getLogger(DeployWSLifeCycle.class);

    /**
     * This hook is called when Axis2 stops.
     * We stop the job from looking into the folder.
     */
    public void shutDown(ConfigurationContext context, AxisService axis) {
       if (LOG.isDebugEnabled()) {
           LOG.debug("Shutting down the deployment service");
       }
       DeployWS ws = DeployWS.getInstance();
       if (ws != null) {
           DeployWS.getInstance().stop();
       }
    }

    /**
     * Hook called by Axis2 when starting up.
     * 
     */
    public void startUp(ConfigurationContext arg0, AxisService arg1) {
        //nothing to do, we just log:
        if (LOG.isDebugEnabled()) {
            LOG.debug("Starting the deployment service");
        }
    }
}
