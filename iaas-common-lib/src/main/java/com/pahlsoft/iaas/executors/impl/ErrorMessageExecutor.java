package com.pahlsoft.iaas.executors.impl;

import java.rmi.RemoteException;

import com.pahlsoft.iaas.executors.Executor;
import com.pahlsoft.iaas.ws.messaging.Exception;
import com.pahlsoft.iaas.ws.messaging.IaasError;
import com.pahlsoft.iaas.ws.messaging.MessageSystemEndpointProxy;

public class ErrorMessageExecutor implements Executor<IaasError> {

	public void sendMessage(IaasError error) {
		MessageSystemEndpointProxy messagingSystemEndpointProxy = new MessageSystemEndpointProxy();
		try {
			messagingSystemEndpointProxy.insertError(error);
		} catch (Exception e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
