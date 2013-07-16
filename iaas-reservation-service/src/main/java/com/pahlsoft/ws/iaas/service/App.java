package com.pahlsoft.ws.iaas.service;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pahlsoft.ws.iaas.dao.ServerDao;
import com.pahlsoft.ws.iaas.dao.StatisticsDao;
import com.pahlsoft.ws.iaas.generated.Server;
import com.pahlsoft.ws.iaas.generated.Statistics;

 
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	ServerDao serverDao = (ServerDao) context.getBean("serverDao");
    	StatisticsDao statsDao = (StatisticsDao) context.getBean("statisticsDao");
    	
    	List<Server> server = serverDao.getServer("maddog1000");
		
    	Statistics stats = statsDao.getServerStats("maddog1000");
    	
		System.out.println("Server: " + server.get(0).getServerName());
		System.out.println("Server: " + server.get(0).getServerUser().getFirstName());
		System.out.println("Server: " + server.get(0).getServerUser().getLastName());
		
		System.out.println("Statistics: Context Switching: " + stats.getConextSwitching());
		System.out.println("Statistics:              Load: " + stats.getServerLoad());
		System.out.println("Statistics:            Uptime: " + stats.getServerUptime());


    }
}