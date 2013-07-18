package com.pahlsoft.iaas.executors.impl;

import java.rmi.RemoteException;

import com.pahlsoft.iaas.executors.Executor;
import com.pahlsoft.iaas.ws.messaging.Exception;
import com.pahlsoft.iaas.ws.messaging.IaasEvent;
import com.pahlsoft.iaas.ws.messaging.MessageSystemEndpointProxy;

public class EventMessageExecutor implements Executor<IaasEvent>{
	
	public void sendMessage(IaasEvent message) {
		MessageSystemEndpointProxy messagingSystemEndpointProxy = new MessageSystemEndpointProxy();
		try {
			messagingSystemEndpointProxy.insertEvent(message);
		} catch (Exception e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
