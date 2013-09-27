package com.pahlsoft.ws.iaas.provision.deploy.behaviors;

import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperties;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionResponse;


public interface DeployBehavior {
	
	public ProvisionResponse backup(String hostname, ProvisionProperties props);
	public ProvisionResponse clean(String hostname, ProvisionProperties props);
	public ProvisionResponse deploy(String hostname, ProvisionProperties props);
	public ProvisionResponse redeploy(String hostname, ProvisionProperties props);
	public ProvisionResponse configure(String hostname, ProvisionProperties props);
	public ProvisionResponse install(String hostname, ProvisionProperties props);
		
}
