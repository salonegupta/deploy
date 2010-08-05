/**
 * Copyright (c) 2005-2007 Intalio inc.
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

/**
 * Component Manager interface for engines supporting deployment locking.
 * Read Lock is supposed to be taken for normal engine operations. 
 * Deployment Service takes write lock during deployment phase. 
 * Lock is shared between engine and deployment service. 
 */
public interface ComponentManagerLockAware extends ComponentManager {
    public void deploymentLock();
    public void deploymentUnlock();
}
