package com.pahlsoft.iaas.orchestration.ejb;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.jboss.ejb3.annotation.ResourceAdapter;

import com.pahlsoft.iaas.ws.reservation.Category;
import com.pahlsoft.iaas.ws.reservation.ReservationSystemEndpointProxy;
import com.pahlsoft.iaas.ws.reservation.Server;
import com.pahlsoft.iaas.ws.reservation.Status;
import com.pahlsoft.iaas.ws.reservation.User;

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
          System.out.println("Processing Expiration Event Message ID: " + eventId);
          // Make a SOAP Call
          ReservationSystemEndpointProxy endpoint = new ReservationSystemEndpointProxy(); 
	    
          ArrayList<String> servers = new ArrayList<String>();
	      servers.add(server);
	      
	      // Convert to an ArrayList to an Array
	   	  String[] _serverArray = servers.toArray(new String[servers.size()]);
	   	  // Expire the Server 
        try {
			endpoint.setExpiration(_serverArray);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	      
          // TODO: Rebuild / Clean Up Server

     }

}