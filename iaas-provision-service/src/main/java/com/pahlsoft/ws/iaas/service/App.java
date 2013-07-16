package com.pahlsoft.ws.iaas.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pahlsoft.ws.iaas.provision.build.behaviors.BuildBehavior;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperties;
import com.pahlsoft.ws.iaas.provision.generated.ProvisionProperty;
 
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	BuildBehavior aixBuilder = (BuildBehavior) context.getBean("aixBuildBehavior");
    	ProvisionProperties props = new ProvisionProperties();
    	ProvisionProperty prop = new ProvisionProperty();
    	
    	prop.setName("osversion");
    	prop.setValue("aix61");
    	props.getProperty().add(prop);
    	aixBuilder.boot("maddog1008", props);

    }
}