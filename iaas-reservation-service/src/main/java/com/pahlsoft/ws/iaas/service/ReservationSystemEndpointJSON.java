package com.pahlsoft.ws.iaas.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.pahlsoft.ws.iaas.dao.ServerDao;
import com.pahlsoft.ws.iaas.dao.UserDao;
import com.pahlsoft.ws.iaas.generated.User;
import com.pahlsoft.ws.iaas.generated.Parent;
import com.pahlsoft.ws.iaas.generated.Server;

@Path("/json/server")
public class ReservationSystemEndpointJSON extends SpringBeanAutowiringSupport {
	
	@Autowired
	ServerDao serverDao;
	@Autowired
	UserDao  userDao;
	
	
	// Required to Autowire the DAOs into a JAX-WS service
	@PostConstruct
	public void init() {
	    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	@GET
	@Path("/getAllServers")
	@Produces("application/json")
	public List<Server> getAllServers() {
		return serverDao.getServers();
	}
	
	@GET
	@Path("/getAllParents")
	@Produces("application/json")
	public List<Parent> getAllParents() {
		return serverDao.getParents();
	}
	
	@GET
	@Path("/getAllReservedServers")
	@Produces("application/json")
	public List<Server> getAllReservedServers() {
		return serverDao.getReservedServers();
	}
	
	@GET
	@Path("/getUnreservedServers")
	@Produces("application/json")
	public List<Server> getUnreservedServers() {
		return serverDao.getUnreservedServers();
	}

	@GET
	@Path("/getAllUsers")
	@Produces("application/json")
	public List<User> getAllUsers() {
		return userDao.getUsers();
	}
	
}
