package com.pahlsoft.iaas.orchestration.ejb;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.ejb.*;

import org.jboss.ejb3.annotation.ResourceAdapter;

import com.pahlsoft.iaas.ws.Category;
import com.pahlsoft.iaas.ws.ReservationSystemEndpointProxy;
import com.pahlsoft.iaas.ws.Server;
import com.pahlsoft.iaas.ws.Status;
import com.pahlsoft.iaas.ws.User;

@MessageDriven(name = "ExpirationMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "expirationQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
}) 
@ResourceAdapter("activemq-rar-5.6-SNAPSHOT.rar")
public class ExpirationMDB implements MessageListener {
	String server;
	String eventId;

     public void onMessage(Message message) {
    	  TextMessage txtMsg = (TextMessage) message;
         try {
        	server = txtMsg.getText();
        	eventId = txtMsg.getJMSCorrelationID();
		} catch (JMSException e) {
			server="";
			e.printStackTrace();
		}
          System.out.println("Processing Host Down Message ID: " + eventId);
          // Make a SOAP Call
          ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy(); 
	    
          ArrayList<Server> servers = new ArrayList<Server>();
	      Server serverObj = new Server();
	     	User userObj = new User();
	      	// Null Or Blank User Values (since they are not needed on the SOAP service)
		      userObj.setFirstName("blank");
		      userObj.setLastName("blank");
		      userObj.setLoginId("blank");
		      userObj.setPhoneNumber("blank");
		      userObj.setUserId(0);
	      serverObj.setServerUser(userObj);
	      serverObj.setServerCategory(Category.LARGE);
	      serverObj.setServerId(0);
	      serverObj.setServerStatus(Status.OFFLINE);
	      serverObj.setExpirationDate("00000000");
	      serverObj.setStartDate("00000000");
	      serverObj.setServerName(server);
	      servers.add(serverObj);
	      
	      // Convert to an ArrayList to an Array
	   	  Server[] _serverArray = servers.toArray(new Server[servers.size()]);
	   	  // Expire the Server 
        try {
			endpoint.setExpiration(_serverArray);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	      
          // TODO: Rebuild / Clean Up Server

     }

}