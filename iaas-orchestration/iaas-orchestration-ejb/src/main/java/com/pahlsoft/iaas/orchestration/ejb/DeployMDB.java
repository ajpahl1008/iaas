package com.pahlsoft.iaas.orchestration.ejb;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.ejb.*;

import org.jboss.ejb3.annotation.ResourceAdapter;


@MessageDriven(name = "DeployMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "deployQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
}) 
@ResourceAdapter("activemq-rar-5.6-SNAPSHOT.rar")
public class DeployMDB implements MessageListener {

	String server;

    public void onMessage(Message message) {
         //System.out.println(((TextMessage)message));
   	  TextMessage txtMsg = (TextMessage) message;
        try {
       	server = txtMsg.getText();
		} catch (JMSException e) {
			server="";
			e.printStackTrace();
		}
        //TODO: Need the APPNAME
         System.out.println("Deploying #APPNAME on: " + server);
    }
}