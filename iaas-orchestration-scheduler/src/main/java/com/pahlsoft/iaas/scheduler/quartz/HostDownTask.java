package com.pahlsoft.iaas.scheduler.quartz;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pahlsoft.iaas.scheduler.dao.ServerDao;
import com.pahlsoft.iaas.scheduler.thread.PingThread;

@Component("hostDownTask")
public class HostDownTask {
	@Autowired
    ServerDao serverDao;
	
	Logger LOG = LoggerFactory.getLogger(HostDownTask.class);
    
	public void executeTask() {
		LOG.info("Searching for Down Servers");
		Map<String,String> servers = new HashMap<String,String>();
		
		servers = serverDao.getAllServers();
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		//Convert Map to list for chunking out into 10 item lists
		List<String> keyList = Collections.list(Collections.enumeration(servers.keySet()));
		List<String> valueList = Collections.list(Collections.enumeration(servers.values()));
		
		Map<String,String> chunkMap = new HashMap<String,String>();
		int chunkSize = 0;

		for (int counter=0; counter<=keyList.size(); counter++) {
			if (chunkSize<9) {
				chunkMap.put(keyList.get(counter), valueList.get(counter));
				chunkSize++;
			} else if (counter==keyList.size() - 1 ) {
				chunkMap.put(keyList.get(counter), valueList.get(counter));
				executor.execute(new PingThread(chunkMap));
			} else { 
				executor.execute(new PingThread(chunkMap));
				chunkMap = new HashMap<String,String>();
				chunkSize=1;
			}
		}
		
			executor.shutdown();

	}
	
}