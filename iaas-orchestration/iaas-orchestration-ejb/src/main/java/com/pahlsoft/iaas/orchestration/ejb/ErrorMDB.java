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

import com.pahlsoft.iaas.executors.impl.ErrorMessageExecutor;
import com.pahlsoft.iaas.ws.messaging.IaasError;

@MessageDriven(name = "ErrorMDB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "errorQueue"),
        @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge")
}) 
@ResourceAdapter("activemq-rar-5.6-SNAPSHOT.rar")
public class ErrorMDB implements MessageListener {
	String eventText;
	String eventId;

     public void onMessage(Message message) {
    	 TextMessage txtMsg = (TextMessage) message;
         IaasError iaasError = new IaasError();

         SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
       	Date date = new Date();
       	String todaysDate = sdf.format(date); 

          try {
         	iaasError.setErrorInfo(txtMsg.getText());
         	iaasError.setCorrelationId(txtMsg.getJMSCorrelationID());
         	iaasError.setErrorId(0);
         	iaasError.setErrorDate(todaysDate);
 		} catch (JMSException e) {
 			eventText="";
 			eventId="";
 			e.printStackTrace();
 		}
         System.out.println("Processing IaaS Error ID: " + eventId);
         ErrorMessageExecutor eme = new ErrorMessageExecutor();
         eme.sendMessage(iaasError);
     }

}