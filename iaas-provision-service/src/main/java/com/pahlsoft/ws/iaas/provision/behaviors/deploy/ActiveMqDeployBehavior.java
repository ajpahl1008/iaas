package com.pahlsoft.ws.iaas.provision.deploy.behaviors;

import org.apache.log4j.Logger;

import com.pahlsoft.ws.iaas.provision.generated.InstructionType;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperties;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionResponse;
import com.pahlsoft.ws.iaas.utilities.PropertyParser;

public class ActiveMqDeployBehavior implements DeployBehavior {
	
	public Logger LOG = Logger.getLogger(ActiveMqDeployBehavior.class);
	public ProvisionResponse pr = new ProvisionResponse();
	
	public ProvisionResponse deploy(String hostname, ProvisionProperties props) {
		LOG.info("Deploying Active MQ  :" + hostname);
			PropertyParser.listProps(props);
			pr.setHostname(hostname);
			pr.setProperties(props);
			pr.setInstruction(InstructionType.DEPLOY);
			pr.setStatus(true);
			return pr;
	}
	public ProvisionResponse redeploy(String hostname, ProvisionProperties props) {
		LOG.info("Redeploying Active MQ  :" + hostname);
		PropertyParser.listProps(props);
		pr.setHostname(hostname);
		pr.setProperties(props);
		pr.setInstruction(InstructionType.REDEPLOY);
		pr.setStatus(true);
		return pr;
	}
	public ProvisionResponse clean(String hostname, ProvisionProperties props) {
		LOG.info("Cleaning Active MQ  :" + hostname);
		PropertyParser.listProps(props);
		pr.setHostname(hostname);
		pr.setProperties(props);
		pr.setInstruction(InstructionType.CLEAN);
		pr.setStatus(true);
		return pr;
	}
	public ProvisionResponse backup(String hostname, ProvisionProperties props) {
		LOG.info("Backing Up Active MQ  :" + hostname);
		PropertyParser.listProps(props);
		pr.setHostname(hostname);
		pr.setProperties(props);
		pr.setInstruction(InstructionType.BACKUP);
		pr.setStatus(true);
		return pr;
	}
	public ProvisionResponse configure(String hostname, ProvisionProperties props) {
		LOG.info("Configuring Active MQ  :" + hostname);
		PropertyParser.listProps(props);
		pr.setHostname(hostname);
		pr.setProperties(props);
		pr.setInstruction(InstructionType.CONFIGURE);
		pr.setStatus(true);
		return pr;
	}
	public ProvisionResponse install(String hostname, ProvisionProperties props) {
		LOG.info("Installing Active MQ  :" + hostname);
		PropertyParser.listProps(props);
		pr.setHostname(hostname);
		pr.setProperties(props);
		pr.setInstruction(InstructionType.INSTALL);
		pr.setStatus(true);
		return pr;
	}

		
}
