/**
 * Copyright (c) 2005-2008 Intalio inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Intalio inc. - initial API and implementation
 */

package org.intalio.deploy.deployment.ws;

import static org.intalio.deploy.deployment.ws.DeployWSConstants.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Collection;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMText;
import org.apache.axiom.om.util.Base64;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.intalio.deploy.deployment.AssemblyId;
import org.intalio.deploy.deployment.DeployedAssembly;
import org.intalio.deploy.deployment.DeploymentResult;
import org.intalio.deploy.deployment.DeploymentService;
import org.intalio.deploy.deployment.ws.OMParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.intalio.bpms.common.AxisUtil;

/**
 * Client web services API for the Token Service.
 */
public class DeployClient implements DeploymentService {
    
    protected static final Logger LOG = LoggerFactory.getLogger(DeployClient.class);

    String _endpoint;
    String _username;
    String _password;
    String _token;
    int _httpTimeout = -1;
    boolean _chunked;

    /**
     * Create a deployment service client
     */
    public DeployClient() {
        // give a chance for chunked to be set from a system property.
        _chunked = "false".equals(System.getProperty("deploy.chunked")) ? false : true;
    }

    public String getEndpointURL() {
        return _endpoint;
    }
    
    public void setEndpointURL(String url) {
        _endpoint = url;
    }
    
    public String getUser() {
        return _username;
    }
    
    public void setUser(String user) {
        _username = user;
    }
    
    public String getPassword() {
        return _password;
    }
    
    public void setPassword(String password) {
        _password = password;
    }
    
    public String getToken() {
        return _token;
    }
    
    public void setToken(String token) {
        _token = token;
    }

    public int getHttpTimeout() {
        return _httpTimeout;
    }

    public void setHttpTimeout(int seconds) {
        _httpTimeout = seconds;
    }
    
    public boolean isChunked() {
        return _chunked;
    }
    
    public void setChunked(boolean c) {
        _chunked = c;
    }

    public DeploymentResult deployAssembly(String assemblyName, InputStream zip) throws RemoteException {
        OMElement request = element(DEPLOY_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyName) );
        request.addChild( elementBinary(ZIP, zip) );
        OMParser response = invoke(DEPLOY_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
    }

    private void setAuthentication(OMElement request) {
        if (_username != null) 
            request.addChild( elementText(USER, _username) );
        if (_password != null) 
            request.addChild( elementText(PASSWORD, _password) );
        if (_token != null) 
            request.addChild( elementText(TOKEN, _token) );
    }

    public Collection<DeployedAssembly> getDeployedAssemblies() throws RemoteException {
        OMElement request = element(GET_DEPLOYED_ASSEMBLIES_REQUEST);
        setAuthentication(request);
        OMParser response = invoke(GET_DEPLOYED_ASSEMBLIES_REQUEST.getLocalPart(), request);
        return OMParser.parseDeployedAssemblies(response);
    }
    
    public DeploymentResult getAssemblyVersion(String assemblyName) throws RemoteException {
        OMElement request = element(GET_DEPLOYED_ASSEMBLY_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyName) );
        OMParser response = invoke(GET_DEPLOYED_ASSEMBLY_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
    }

    public DeploymentResult undeployAssembly(AssemblyId assemblyId) throws RemoteException {
        OMElement request = element(UNDEPLOY_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyId.getAssemblyName()) );
        request.addChild( elementText(ASSEMBLY_VERSION, Integer.toString(assemblyId.getAssemblyVersion())) );
        OMParser response = invoke(UNDEPLOY_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
    }

    protected OMParser invoke(String action, OMElement request) throws AxisFault {

       AxisUtil util = new AxisUtil();
        ServiceClient serviceClient = null;
        OMElement response = null;
        try {
            serviceClient = util.getServiceClient();
            Options options = util.getDefaultOptions();
            EndpointReference targetEPR = new EndpointReference(_endpoint);
            options.setTo(targetEPR);
            options.setAction(action);
            serviceClient.setOptions(options);
            if (_httpTimeout > 0) {
                options.setProperty(org.apache.axis2.transport.http.HTTPConstants.SO_TIMEOUT, new Integer(_httpTimeout*1000));
            }
            if (!_chunked) {
                options.setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, false);
            }
            response = serviceClient.sendReceive(request);
        }catch(AxisFault e){
            LOG.error("Error during invoke " , e);
         }
        finally {
            try {
                util.closeClient(serviceClient);
            }catch (AxisFault e) {
                LOG.error("Error while closing the Axis services " , e);
            }
         }
         return new OMParser(response);
 
     }
     
    
    private static OMElement element(QName name) {
        return OM_FACTORY.createOMElement(name);
    }

    private static OMElement elementText(QName name, String text) {
        OMElement element = OM_FACTORY.createOMElement(name);
        element.setText(text);
        return element;
    }

    private static OMElement elementBinary(QName name, InputStream input) {
        OMElement element = OM_FACTORY.createOMElement(name);
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(64*1024);
            byte[] buffer = new byte[4096];
            int len;
            while ((len = input.read(buffer)) >= 0) {
                outputStream.write(buffer, 0, len);
            }
            String base64Enc = Base64.encode(outputStream.toByteArray());
            OMText binary = OM_FACTORY.createOMText(base64Enc, "application/zip", true);
            element.addChild(binary);
            return element;
        } catch (IOException except) {
            throw new RuntimeException(except);
        }
    }

    private static OMElement elementBoolean(QName name, boolean value) {
        OMElement element = OM_FACTORY.createOMElement(name);
        element.setText(value ? "true" : "false");
        return element;
    }

	public DeploymentResult activate(AssemblyId assemblyId) throws RemoteException {
        OMElement request = element(ACTIVATE_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyId.getAssemblyName()) );
        request.addChild( elementText(ASSEMBLY_VERSION, Integer.toString(assemblyId.getAssemblyVersion())) );
        OMParser response = invoke(ACTIVATE_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
	}
	public DeploymentResult activateProcess(AssemblyId assemblyId, String processName) throws RemoteException {
        OMElement request = element(ACTIVATE_PROCESS_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyId.getAssemblyName()) );
        request.addChild( elementText(ASSEMBLY_VERSION, Integer.toString(assemblyId.getAssemblyVersion())) );
        request.addChild( elementText(PROCESS_NAME, processName));
        OMParser response = invoke(ACTIVATE_PROCESS_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
	}

	public DeploymentResult retire(AssemblyId assemblyId) throws RemoteException {
        OMElement request = element(DEACTIVATE_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyId.getAssemblyName()) );
        request.addChild( elementText(ASSEMBLY_VERSION, Integer.toString(assemblyId.getAssemblyVersion())) );
        OMParser response = invoke(DEACTIVATE_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
	}
	
	public DeploymentResult retireAssembly(AssemblyId assemblyId) throws RemoteException {
        OMElement request = element(DEACTIVATE_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyId.getAssemblyName()) );
        request.addChild( elementText(ASSEMBLY_VERSION, Integer.toString(assemblyId.getAssemblyVersion())) );
        OMParser response = invoke(DEACTIVATE_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
	}

	public DeploymentResult deployAssembly(String assemblyName, InputStream zip, boolean activate) throws RemoteException {
        OMElement request = element(DEPLOY_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyName) );
        request.addChild( elementBinary(ZIP, zip) );
        request.addChild( elementBoolean(ACTIVATE, activate) );
        OMParser response = invoke(DEPLOY_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
	}
	
	public DeploymentResult retireProcess(AssemblyId assemblyId, String processName) throws RemoteException {
        OMElement request = element(DEACTIVATE_PROCESS_REQUEST);
        setAuthentication(request);
        request.addChild( elementText(ASSEMBLY_NAME, assemblyId.getAssemblyName()) );
        request.addChild( elementText(ASSEMBLY_VERSION, Integer.toString(assemblyId.getAssemblyVersion())) );
        request.addChild( elementText(PROCESS_NAME, processName));
        OMParser response = invoke(DEACTIVATE_PROCESS_REQUEST.getLocalPart(), request);
        return OMParser.parseDeploymentResult(response);
	}
	
	
}