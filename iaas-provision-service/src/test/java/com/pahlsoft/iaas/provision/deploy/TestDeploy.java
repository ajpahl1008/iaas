package com.pahlsoft.iaas.provision.deploy;

import org.junit.Test;

import com.pahlsoft.ws.iaas.provision.deploy.Deploy;
import com.pahlsoft.ws.iaas.provision.deploy.behaviors.JbossDeployBehavior;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperties;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperty;

import junit.framework.TestCase;

public class TestDeploy extends TestCase {
 
	@Test
	public void testJbossInstallShouldPass() {
		Deploy deployer = new Deploy();
		deployer.setDeployBehavior(new JbossDeployBehavior());
		ProvisionProperties props = new ProvisionProperties();
    	ProvisionProperty prop = new ProvisionProperty();
    	prop.setName("mode");
    	prop.setValue("standalone");
    	props.getProperty().add(prop);
		deployer.performInstall("maddog1008", props);
	}
	
	
	}
