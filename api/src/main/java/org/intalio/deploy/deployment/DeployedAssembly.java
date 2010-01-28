/**
 * Copyright (c) 2007-2010 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Intalio inc. - initial API and implementation
 */

package org.intalio.deploy.deployment;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Deployed assembly.
 * <p>
 * This is an immutable data object returned when querying {@link DeploymentService#getDeployedAssemblies()} 
 */
public class DeployedAssembly implements Serializable {
    private static final long serialVersionUID = 2L;
    private static final Logger LOG = LoggerFactory.getLogger(DeployedAssembly.class);
    
    final AssemblyId _aid;
    final String _assemblyDir;
    final List<DeployedComponent> _components;
    final boolean _active;

    public DeployedAssembly(AssemblyId assemblyId, String assemblyDir, List<DeployedComponent> components, boolean active)
    {
        if (LOG.isTraceEnabled()) {
            StringBuilder builder = new StringBuilder();
            builder.append("Created assembly with " + assemblyId +" under " + assemblyDir + "(active=" + active + ")" );
            for (DeployedComponent component : components) {
                builder.append(component.toString());
                builder.append(",");
            }
            LOG.trace(builder.toString());
        }
        _aid = assemblyId;
        _assemblyDir = assemblyDir;
        _components = components;
        _active = active;
    }
    
    public AssemblyId getAssemblyId() {
        return _aid;
    }
    
    public String getAssemblyDir() {
        return _assemblyDir;
    }
    
    public List<DeployedComponent> getDeployedComponents() {
        return _components;
    }

    public boolean isActive() {
        return _active;
    }
    
    public String toString() {
        return _aid.toString();
    }
}
