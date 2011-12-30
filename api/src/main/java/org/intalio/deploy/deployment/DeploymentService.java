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

import java.io.InputStream;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;


/**
 * Interface for the deployment service.
 */
public interface DeploymentService extends Remote {

    /**
     * Deploy a packaged (zipped) assembly
     */
    DeploymentResult deployAssembly(String assemblyName, InputStream zip, boolean activate ) throws RemoteException;

    /**
     * Deploy a packaged (zipped) assembly and activate the version; this one stays here for backward-compatibility
     */
    DeploymentResult deployAssembly(String assemblyName, InputStream zip) throws RemoteException;

    /**
     * Undeploy an assembly 
     */
    DeploymentResult undeployAssembly(AssemblyId assemblyId) throws RemoteException;

    /**
     * Obtain the current list of deployed assemblies
     */
    Collection<DeployedAssembly> getDeployedAssemblies() throws RemoteException;
    
    /**
     * Activates the version of the assembly specified by the given assembly id. To activate a version is to
     * set the version as the default one. This method retires any pre-activated versions if they are
     * different from the specified version.
     * 
     * @param name
     */
    DeploymentResult activate(AssemblyId assemblyId) throws RemoteException;
    
    /**
     * Retires all revisions for the assembly. The version number inside the
     * AssemblyId is ignored.
     */    
    DeploymentResult retire(AssemblyId assemblyId) throws RemoteException;
    
    /**
     * Retires the version of the assembly specified by the given assembly id. This method does nothing if the 
     * given version is already retired.
     * 
     * @param name
     */    
    public DeploymentResult retireAssembly(AssemblyId assemblyId) throws RemoteException;
    
    /**
     * Retires the process of the assembly specified by the given assembly id. 
     *
     */    
    public DeploymentResult retireProcess(AssemblyId assemblyId , String processName) throws RemoteException;
    
    /**
     * Activates the process of the assembly specified by the given assembly id. 
     *
     */    
    public DeploymentResult activateProcess(AssemblyId assemblyId , String processName) throws RemoteException;
    
    public DeploymentResult getAssemblyVersion(String assemblyName) throws RemoteException;
}
