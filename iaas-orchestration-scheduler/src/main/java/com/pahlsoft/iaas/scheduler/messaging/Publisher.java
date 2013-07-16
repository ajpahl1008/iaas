package com.pahlsoft.iaas.scheduler.messaging;

import java.util.UUID;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Publisher extends Thread {

	private static Destination destination;
	private static int messageCount = 10;
	private static long sleepTime;
	private static boolean verbose = true;
	private static int messageSize = 255;
	private static long timeToLive;
	private static String user = ActiveMQConnection.DEFAULT_USER;
	private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
	private static String url;
	private static String subject = "";
	private static boolean topic;
	private static boolean transacted;
	private static boolean persistent;
	private static boolean messageStatus = true;
	
	private static Logger publisherLog = LoggerFactory.getLogger(Publisher.class);


	public static boolean publish(String subject, String message) {
		Publisher.subject = subject;
		Connection connection = null;
		url = System.getProperty("iaas.messaging.destination");
		try {

			// Create the connection.
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
			
			connection = connectionFactory.createConnection();
			connection.start();
			
			// Create the session
			Session session = connection.createSession(transacted,
					Session.AUTO_ACKNOWLEDGE);
			if (topic) {
				destination = session.createTopic(subject);
			} else {
				destination = session.createQueue(subject);
			}

			// Create the producer.
			MessageProducer producer = session.createProducer(destination);
			if (persistent) {
				producer.setDeliveryMode(DeliveryMode.PERSISTENT);
			} else {
				producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			}
			if (timeToLive != 0) {
				producer.setTimeToLive(timeToLive);
			}
			

			messageStatus = sendMessage(session,producer,message);

		} catch (Exception e) {
			publisherLog.debug("Publisher: Messaging Exception: ", e);
		} finally {
			try {
				connection.close();
			} catch (Throwable ignore) {
			}

		}
		
		return messageStatus;
	}

	protected static boolean sendMessage(Session session, MessageProducer producer,
			String TestMessage) throws Exception {

		TextMessage message = session.createTextMessage(TestMessage.toString());
		message.setJMSCorrelationID(UUID.randomUUID().toString());
		
		publisherLog.info("Publisher message: " + TestMessage.toString());

		try {
			producer.send(message);
			if (transacted) {
				session.commit();
			} 
			
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}
	
	public void setPersistent(boolean durable) {
        Publisher.persistent = durable;
    }

    public void setMessageCount(int messageCount) {
        Publisher.messageCount = messageCount;
    }

    public void setMessageSize(int messageSize) {
        Publisher.messageSize = messageSize;
    }

    public void setPassword(String pwd) {
        Publisher.password = pwd;
    }

    public void setSleepTime(long sleepTime) {
        Publisher.sleepTime = sleepTime;
    }

    public void setSubject(String subject) {
        Publisher.subject = subject;
    }

    public void setTimeToLive(long timeToLive) {
        Publisher.timeToLive = timeToLive;
    }

    public void setTopic(boolean topic) {
        Publisher.topic = topic;
    }

    public void setQueue(boolean queue) {
        Publisher.topic = !queue;
    }

    public void setTransacted(boolean transacted) {
        Publisher.transacted = transacted;
    }

    public void setUrl(String url) {
        Publisher.url = url;
    }

    public void setUser(String user) {
        Publisher.user = user;
    }

    public void setVerbose(boolean verbose) {
        Publisher.verbose = verbose;
    }

}
