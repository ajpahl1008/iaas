package com.pahlsoft.iaas.scheduler.thread;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pahlsoft.iaas.jms.Publisher;


public class PingThread implements Runnable {
	
	Map<String,String> targets = new HashMap<String,String>();
	
	public PingThread(Map<String,String> targetMap) {
		this.targets=targetMap;
	}
	
	@Override
	public void run() {

		Logger LOG = LoggerFactory.getLogger(PingThread.class);

		Set<String> names = targets.keySet();
		LOG.info("Thread ID: " + Thread.currentThread().getId());
		for (String serverName: names) {
			try {
				if(InetAddress.getByName(targets.get(serverName)).isReachable(Integer.parseInt(System.getProperty("iaas.orchestration.scheduler.timeout")))) {
					LOG.info("Host: " + serverName + " IP: " + targets.get(serverName) + " available");
				} else {
					LOG.info("Host: " + serverName + " IP: " + targets.get(serverName) + " down");
					Publisher.publish("hostDownQueue", serverName);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	
	}
}
