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

package org.intalio.deploy.deployment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Deployed component.
 * <p>
 * This is an immutable data object returned when querying {@link DeploymentService#getDeployedAssemblies()} 
 */
public class DeployedComponent implements Serializable {
    private static final long serialVersionUID = 1L;

    final static List<String> EMPTY_RESOURCE_LIST = new ArrayList<String>(0);
    private final static String PIPA ="pipa";

    final ComponentId _componentId;
    final String _componentDir;
    final String _componentManagerName;
    final List<String> _deployedResources;

    public DeployedComponent(ComponentId ComponentId, String componentDir, String componentManagerName) {
    	this(ComponentId, componentDir, componentManagerName, EMPTY_RESOURCE_LIST);
    }

    public DeployedComponent(ComponentId ComponentId, String componentDir, String componentManagerName, List<String> deployedResources) {
        _componentId = ComponentId;
        _componentDir = componentDir;
        _componentManagerName = componentManagerName;
        _deployedResources = deployedResources;
    }
    
    public ComponentId getComponentId() {
        return _componentId;
    }
    
    public String getComponentDir() {
        return _componentDir;
    }
    
    public String getComponentManagerName() {
        return _componentManagerName;
    }
    
    public List<String> getDeployedResources() {
        if(PIPA.equalsIgnoreCase(_componentManagerName)) {
            verifyPipaResources();
        }
    	return _deployedResources;
    }
    
    public String toString() {
        return _componentId.toString() + "." + _componentManagerName;
    }

	public boolean equals(Object obj) {
        if (obj instanceof DeployedComponent) {
        	DeployedComponent other = (DeployedComponent) obj;
        	return _componentId.equals(other._componentId) && _componentManagerName.equals(other._componentManagerName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return super.hashCode() + _componentManagerName.hashCode() * 13;
    }

    /**
     * To maintain versioning of PIPA form we are appending assembly id to form
     * url from 7.5.x version, I case of migration it might be that there is not
     * proper data to handle migration issue in this method we are verifying
     * that assembly id is properly appended.
     * 
     */
    private void verifyPipaResources() {
        String resourceSuffix = "?" + _componentId.getAssemblyId().toString();
        Iterator<String> itr = _deployedResources.iterator();
        int index = 0;
        while (itr.hasNext()) {
            String deployedResource = itr.next();
            if (!deployedResource.endsWith(resourceSuffix)) {
                deployedResource = deployedResource + resourceSuffix;
                _deployedResources.set(index, deployedResource);
            }
            index++;
        }
    }
}
