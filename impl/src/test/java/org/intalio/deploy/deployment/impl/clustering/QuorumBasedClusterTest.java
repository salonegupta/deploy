package org.intalio.deploy.deployment.impl.clustering;

import junit.framework.TestCase;

public class QuorumBasedClusterTest extends TestCase {
    public void testResolveServerId() throws Exception {
        QuorumBasedCluster cluster1 = new QuorumBasedCluster();
        String serverId1 = cluster1.getServerId();
        assertNotNull(serverId1);
        cluster1.start();
        assertEquals(serverId1, cluster1.getServerId());
        
        QuorumBasedCluster cluster2 = new QuorumBasedCluster();
        assertFalse(serverId1.equals(cluster2.getServerId()));
        System.setProperty(QuorumBasedCluster.DEPLOY_SERVER_ID_PROP, "junit2");
        cluster2.start();
        assertEquals("junit2", cluster2.getServerId());
    }
}
