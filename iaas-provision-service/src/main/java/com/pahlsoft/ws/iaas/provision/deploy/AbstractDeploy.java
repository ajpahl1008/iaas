package com.pahlsoft.ws.iaas.provision.deploy;


import java.util.Properties;

import com.pahlsoft.ws.iaas.provision.build.behaviors.BuildBehavior;
import com.pahlsoft.ws.iaas.provision.deploy.behaviors.DeployBehavior;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperties;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionResponse;

public abstract class AbstractDeploy {
	
	// Build Interfaces for Different Types of Operating Systems
	DeployBehavior deployBehavior;
	// Properties that need to feed the methods 
    Properties deployProperties;
	
	public AbstractDeploy() {
		
	}
	
	public ProvisionResponse performDeploy(String hostname, ProvisionProperties props) {
		return deployBehavior.deploy(hostname, props);
	}

	public ProvisionResponse performRedeploy(String hostname, ProvisionProperties props) {
		return deployBehavior.redeploy(hostname, props);
	}
	public ProvisionResponse performBackup(String hostname, ProvisionProperties props) {
		return deployBehavior.backup(hostname, props);
	}
	
	public ProvisionResponse performClean(String hostname, ProvisionProperties props) {
		return deployBehavior.clean(hostname, props);
	}
	
	public ProvisionResponse performInstall(String hostname, ProvisionProperties props) {
		return deployBehavior.install(hostname, props);
	}
	
	public void setDeployBehavior(DeployBehavior deployBehavior) {
		this.deployBehavior = deployBehavior;
	}
	
	public Properties getDeployProperties() {
		return deployProperties;
	}

	public void setDeployProperties(Properties deployProperties) {
		this.deployProperties = deployProperties;
	}



}
