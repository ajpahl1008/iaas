package com.pahlsoft.ws.iaas.service;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.pahlsoft.ws.iaas.provision.build.behaviors.BuildBehavior;
import com.pahlsoft.ws.iaas.provision.deploy.behaviors.DeployBehavior;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperties;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionResponse;

@Service
@WebService(name ="ProvisionSystemEndpoint",targetNamespace="http://iaas.ws.pahlsoft.com")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class ProvisionSystemEndpoint extends SpringBeanAutowiringSupport {

	public Logger LOG = Logger.getLogger(ProvisionSystemEndpoint.class);
	
	@Autowired
	BuildBehavior aixBuildBehavior;
	@Autowired
	BuildBehavior windowsBuildBehavior;
	@Autowired
	BuildBehavior linuxBuildBehavior;
	@Autowired
	DeployBehavior jbossDeployBehavior;
	@Autowired
	DeployBehavior activeMqDeployBehavior;
	@Autowired
	DeployBehavior wasDeployBehavior;
	
	
	// Required to Autowire from beans
	@PostConstruct
	public void init() {
	    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

	@WebMethod
	public ProvisionResponse installAixServer(@WebParam(name="provisionInfo", targetNamespace="http://iaas.ws.pahlsoft.com") String hostname, @WebParam(name="provisionProps",targetNamespace="http://iaas.ws.pahlsoft.com") ProvisionProperties props) throws Exception {
		return aixBuildBehavior.install(hostname, props);
	}
	
	@WebMethod
	public ProvisionResponse installWinServer(@WebParam(name="provisionInfo", targetNamespace="http://iaas.ws.pahlsoft.com") String hostname, @WebParam(name="provisionProps",targetNamespace="http://iaas.ws.pahlsoft.com") ProvisionProperties props) throws Exception {
		return windowsBuildBehavior.install(hostname, props);
	}
	
	@WebMethod
	public ProvisionResponse installLinuxServer(@WebParam(name="provisionInfo", targetNamespace="http://iaas.ws.pahlsoft.com") String hostname, @WebParam(name="provisionProps",targetNamespace="http://iaas.ws.pahlsoft.com") ProvisionProperties props) throws Exception {
		return linuxBuildBehavior.install(hostname, props);
	}
	
	@WebMethod
	public ProvisionResponse installJbossApplicationServer(@WebParam(name="provisionInfo", targetNamespace="http://iaas.ws.pahlsoft.com") String hostname, @WebParam(name="provisionProps",targetNamespace="http://iaas.ws.pahlsoft.com") ProvisionProperties props) throws Exception {
		return jbossDeployBehavior.install(hostname, props);
	}
	
	@WebMethod
	public ProvisionResponse installActiveMqApplicationServer(@WebParam(name="provisionInfo", targetNamespace="http://iaas.ws.pahlsoft.com") String hostname, @WebParam(name="provisionProps",targetNamespace="http://iaas.ws.pahlsoft.com") ProvisionProperties props) throws Exception {
		return activeMqDeployBehavior.install(hostname, props);
	}
	
	@WebMethod
	public ProvisionResponse installWasApplicationServer(@WebParam(name="provisionInfo", targetNamespace="http://iaas.ws.pahlsoft.com") String hostname, @WebParam(name="provisionProps",targetNamespace="http://iaas.ws.pahlsoft.com") ProvisionProperties props) throws Exception {
		return wasDeployBehavior.install(hostname, props);
	}
	
}
