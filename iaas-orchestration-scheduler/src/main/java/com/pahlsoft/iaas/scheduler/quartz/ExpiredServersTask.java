package com.pahlsoft.iaas.scheduler.quartz;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pahlsoft.iaas.jms.Publisher;
import com.pahlsoft.iaas.scheduler.dao.ServerDao;

@Component("task")
public class ExpiredServersTask {
	@Autowired
    ServerDao serverDao;
	
	Logger LOG = LoggerFactory.getLogger(ExpiredServersTask.class);
    
	public void printMe() {
		
		List<String> servers = new ArrayList<String>();
		
		servers = serverDao.getExpiredServers();
		
		LOG.info("Reporting on Expired Servers");
		
		for (String server: servers) {
			System.out.println(server);
			Publisher.publish("expirationQueue", server);
		}
		
	}
}