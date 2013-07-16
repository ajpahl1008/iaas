package com.pahlsoft.iaas.orchestration.ejb;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.ejb.*;

import org.jboss.ejb3.annotation.ResourceAdapter;

@MessageDriven(name = "EventMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "eventQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
}) 
@ResourceAdapter("activemq-rar-5.6-SNAPSHOT.rar")
public class EventMDB implements MessageListener {
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
          System.out.println("Processing IaaS Event ID: " + eventId);
//          // Make a SOAP Call
//          ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy(); 
//	    
//          ArrayList<Server> servers = new ArrayList<Server>();
//	      Server serverObj = new Server();
//	     	User userObj = new User();
//	      	// Null Or Blank User Values (since they are not needed on the SOAP service)
//		      userObj.setFirstName("blank");
//		      userObj.setLastName("blank");
//		      userObj.setLoginId("blank");
//		      userObj.setPhoneNumber("blank");
//		      userObj.setUserId(0);
//	      serverObj.setServerUser(userObj);
//	      serverObj.setServerCategory(Category.LARGE);
//	      serverObj.setServerId(0);
//	      serverObj.setServerStatus(Status.OFFLINE);
//	      serverObj.setExpirationDate("00000000");
//	      serverObj.setStartDate("00000000");
//	      serverObj.setServerName(eventText);
//	      servers.add(serverObj);
//	      
//	      // Convert to an ArrayList to an Array
//	   	  Server[] _serverArray = servers.toArray(new Server[servers.size()]);
	   	  // Expire the Server 
//        try {
//			endpoint.setExpiration(_serverArray);
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}

     }

}