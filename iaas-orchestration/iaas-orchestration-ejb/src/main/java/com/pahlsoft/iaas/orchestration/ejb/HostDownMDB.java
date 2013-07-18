package com.pahlsoft.iaas.orchestration.ejb;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.ejb.*;

import org.jboss.ejb3.annotation.ResourceAdapter;

@MessageDriven(name = "HostDownMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "hostDownQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
}) 
@ResourceAdapter("activemq-rar-5.6-SNAPSHOT.rar")
public class HostDownMDB implements MessageListener {
	String eventText;
	String eventId;

     public void onMessage(Message message) {
    	  TextMessage txtMsg = (TextMessage) message;
         try {
        	eventText = txtMsg.getText();
        	eventId = txtMsg.getJMSCorrelationID();
		} catch (JMSException e) {
			eventText="";
			eventId="";
			e.printStackTrace();
		}
          System.out.println("Processing Host Down Message ID: " + eventId);

     }

}