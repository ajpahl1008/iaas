package com.pahlsoft.iaas.orchestration.ejb;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.jboss.ejb3.annotation.ResourceAdapter;

import com.pahlsoft.iaas.executors.impl.EventMessageExecutor;
import com.pahlsoft.iaas.ws.messaging.IaasEvent;

@MessageDriven(name = "EventMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "eventQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
}) 
@ResourceAdapter("activemq-rar-5.6-SNAPSHOT.rar")
public class EventMDB implements MessageListener {

     public void onMessage(Message message) {
    	TextMessage txtMsg = (TextMessage) message;
        IaasEvent iaasEvent = new IaasEvent();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
      	Date date = new Date();
      	String todaysDate = sdf.format(date); 

         try {
        	iaasEvent.setEventInfo(txtMsg.getText());
        	iaasEvent.setCorrelationId(txtMsg.getJMSCorrelationID());
        	iaasEvent.setEventId(0);
        	iaasEvent.setEventDate(todaysDate);
		} catch (JMSException e) {
			e.printStackTrace();
		}
        System.out.println("Processing IaaS Event ID: " + iaasEvent.getCorrelationId());
        EventMessageExecutor eme = new EventMessageExecutor();
        eme.sendMessage(iaasEvent);

     }

}