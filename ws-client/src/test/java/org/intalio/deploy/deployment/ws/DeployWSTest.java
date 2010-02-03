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

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

import junit.framework.TestCase;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.intalio.deploy.deployment.AssemblyId;
import org.intalio.deploy.deployment.DeployedAssembly;
import org.intalio.deploy.deployment.DeployedComponent;
import org.intalio.deploy.deployment.DeploymentResult;
import org.intalio.deploy.deployment.impl.DeployServiceDeployTest;
import org.intalio.deploy.deployment.impl.MockComponentManager;
import org.intalio.deploy.deployment.ws.DeployClient;
import org.junit.Test;

/**
 * Integration tests for DeployWS: exercise the marshalling/unmarshalling between the client and server.
 * 
 * Uses direct in-VM invocation by default.  If the property "org.intalio.deploy.deploy.ws.endpoint"
 * is defined, it is used to make actual WS calls against a live instance.
 */
public class DeployWSTest extends TestCase {

    protected static DeployClient _client;

    //@BeforeClass
    static {
        String config = DeployWSTest.class.getClassLoader().getResource("deploy-service.xml").getFile();
        String dir = new File(config).getParent();
        System.setProperty(DeployWS.CONFIG_DIR_PROPERTY, dir);

        String endpoint = System.getProperty("org.intalio.deploy.deploy.ws.endpoint");
        String user = System.getProperty("org.intalio.deploy.deploy.ws.user");
        String password = System.getProperty("org.intalio.deploy.deploy.ws.password");
        String token = System.getProperty("org.intalio.deploy.deploy.ws.token");

        DeployServiceDeployTest test = new DeployServiceDeployTest();
        try {
            test.setUp();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }

        if (endpoint != null) {
            System.out.println("Using LIVE ENDPOINT "+endpoint);
            _client = new DeployClient();
            _client.setEndpointURL(endpoint);
            _client.setUser(user);
            _client.setPassword(password);
            _client.setToken(token);
        } else {
            _client = new DeployClientMock();
            MockComponentManager mock = new MockComponentManager("MockEngine");
            ((DeployClientMock)_client)._deployWS._deployService.getCallback().available(mock);
        }
    }
    
    @Test
    public void testDisableChunking() throws Exception {
        //by default, the deploy chunking is set to true:
        assertTrue(new DeployClient().isChunked());
        // a system property may be used to set the chunking
        System.setProperty("deploy.chunked", "maybe");
        assertTrue(new DeployClient().isChunked());
        System.setProperty("deploy.chunked", "false");
        System.err.println(new DeployClient().isChunked());// REMOVE
        assertFalse(new DeployClient().isChunked());
        System.setProperty("deploy.chunked", "maybe");
        assertTrue(new DeployClient().isChunked());
    }

    @Test
    public void testDeploy() throws Exception {
        String file = DeployWSTest.class.getClassLoader().getResource("assembly1.zip").getFile();
        FileInputStream zip = new FileInputStream(file);
        DeploymentResult result = _client.deployAssembly("assembly1", zip, true);
        if (!result.isSuccessful())
            System.out.println(result);
        assertTrue(result.isSuccessful());
        assertEquals("assembly1", result.getAssemblyId().getAssemblyName());
        
    }

    @Test
    public void testUndeploy() throws Exception {
        _client.undeployAssembly(new AssemblyId("assembly1"));
    }

    
    @Test
    public void testGetDeployedAssemblies() throws Exception {
        _client.getDeployedAssemblies();
    }
    
    @Test
    public void testDeployGetUndeployAssemblies() throws Exception {
        Collection<DeployedAssembly> assemblies = _client.getDeployedAssemblies();
        for (DeployedAssembly assembly : assemblies) {
            System.out.println("already deployed: "+assembly);
            if (assembly.getAssemblyId().getAssemblyName().equals("assembly1")) {
                testUndeploy();
            }
        }   
        assemblies = _client.getDeployedAssemblies();
        for (DeployedAssembly assembly : assemblies) {
            System.out.println("already deployed after: "+assembly);
            assertFalse("assembly1 not undeployed", assembly.getAssemblyId().getAssemblyName().equals("assembly1"));
        }

        this.testDeploy();

        assemblies = _client.getDeployedAssemblies();
        boolean deployed = false;
        for (DeployedAssembly assembly : assemblies) {
            System.out.println("deployed: "+assembly);
            Collection<DeployedComponent> components = assembly.getDeployedComponents();
            if (assembly.getAssemblyId().equals("AbsenceRequest")) {
                assertTrue(components.size() >= 2);
            }
            if (assembly.getAssemblyId().getAssemblyName().equals("assembly1")) {
                deployed = true;
                break;
            }
        }
        assertTrue("assembly1 deployed", deployed);
        
        this.testUndeploy();

        assemblies = _client.getDeployedAssemblies();
        for (DeployedAssembly assembly : assemblies) {
            assertFalse("assembly1 not undeployed", assembly.getAssemblyId().getAssemblyName().equals("assembly1"));
        }
    }


    static class DeployClientMock extends DeployClient {

        DeployWS _deployWS = new DeployWS(false);

        public DeployClientMock() {
            super();
        }

        protected OMParser invoke(String action, OMElement request) throws AxisFault {
            try {
                long start = System.currentTimeMillis();
                while (!_deployWS._deployService.isStarted()) {
                    try { 
                        Thread.sleep(100);
                        if (System.currentTimeMillis()-start > 30000) 
                            throw new RuntimeException("DeploymentService did not start after 30 seconds!");
                    } catch (InterruptedException except) {}
                }
                Method method = _deployWS.getClass().getMethod(action, OMElement.class);
                OMElement response = (OMElement) method.invoke(_deployWS, request);
                return new OMParser(response);
            } catch (InvocationTargetException except) {
                throw AxisFault.makeFault(except.getTargetException());
            } catch (Exception except) {
                throw new RuntimeException(except);
            }
        }
    }
}
