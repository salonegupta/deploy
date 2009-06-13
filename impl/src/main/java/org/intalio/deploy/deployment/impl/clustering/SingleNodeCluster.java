package org.intalio.deploy.deployment.impl.clustering;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A cluster implementation using the NullObject pattern.
 * 
 * @author sean
 *
 */
public class SingleNodeCluster implements Cluster {
	private List<String> members = new ArrayList<String>();
	
	public SingleNodeCluster() {
		members.add("myself in a single node configuration");
	}
	
	public String getServerId() {
		return "myself in a single node configuration";
	}

	public void start() {
		// do nothing
	}
	
	public void shutdown() {
		// do nothing
	}
	
	public void sendMessage(Serializable obj) {
		// do nothing
	}
	
	public boolean isCoordinator() {
		return true;
	}
	
	public void warmUp() {
		// do nothing
	}
	
	public List<String> getAllCurrentMembers() {
		return members;
	}

	public ClusterListener getListener() {
		return null;
	}

	public void setListener(ClusterListener listener) {
		// do nothing
	}

	public String getGroupName() {
		return null;
	}

	public void setGroupName(String groupName) {
		// do nothing
	}
}
