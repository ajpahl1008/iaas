package com.pahlsoft.iaas.mt.messaging;

import junit.framework.TestCase;


import org.junit.Test;

import com.pahlsoft.iaas.scheduler.messaging.Publisher;


public class PublisherTest extends TestCase {
	
	public void testExpirationPublisherShouldReturnTrue() {
		assertEquals(true,Publisher.publish("expirationQueue","maddog1090"));
	}
	
	@Test(expected=NullPointerException.class)
	public void testExpirationPublisherMissingServerShouldThrowNullPointerException(){
		 Publisher.publish("expirationQueue",null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testExpirationPublisherMissingQueueShouldThrowNullPointerException(){
		 Publisher.publish(null,"maddog1090");
	}



}
