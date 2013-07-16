package com.pahlsoft.iaas.scheduler.quartz;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.pahlsoft.iaas.scheduler.dao.ServerDao;

 
@Component
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	ServerDao serverDao = (ServerDao) context.getBean("serverDao");
		
//    	System.out.println("Expired Server List: ");
//    	
//    	for (String string : serverDao.getExpiredServers()) {
//    		System.out.println(string);
//    	}

    }
 }