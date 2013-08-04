package com.pahlsoft.iaas.ui.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pahlsoft.iaas.ui.client.AsyncError;
import com.pahlsoft.iaas.ui.client.AsyncEvent;
import com.pahlsoft.iaas.ui.client.MessagingService;
import com.pahlsoft.iaas.ws.messaging.IaasError;
import com.pahlsoft.iaas.ws.messaging.IaasEvent;
import com.pahlsoft.iaas.ws.messaging.MessageSystemEndpointProxy;


/**
 * The server side implementation of the RPC service.
 */

@SuppressWarnings("serial")
public class MessageServiceImpl extends RemoteServiceServlet implements	MessagingService {

	private AsyncEvent toAsync(IaasEvent event) {
		AsyncEvent _asyncEvent= new AsyncEvent();
		_asyncEvent.setEventId(event.getEventId());
		_asyncEvent.setEventDate(event.getEventDate().toString());
		_asyncEvent.setEventCid(event.getCorrelationId());
		_asyncEvent.setEventInfo(event.getEventInfo());
		return _asyncEvent;
	}
	
//	private IaasEvent fromAsync(AsyncEvent asyncEvent) {
//		IaasEvent _event = new IaasEvent();
//		_event.setEventId(asyncEvent.getEventId());
//		_event.setEventDate(asyncEvent.getEventDate());
//		_event.setCorrelationId(asyncEvent.getEventCid());
//		_event.setEventInfo(asyncEvent.getEventInfo());
//		return _event; 
//	}
	
	
	private AsyncError toAsync(IaasError error) {
		AsyncError _asyncError= new AsyncError();
		_asyncError.setErrorId(error.getErrorId());
		_asyncError.setErrorDate(error.getErrorDate().toString());
		_asyncError.setErrorCid(error.getCorrelationId());
		_asyncError.setErrorInfo(error.getErrorInfo());
		return _asyncError;
	}
	
//	private IaasError fromAsync(AsyncError asyncError) {
//		IaasError _error = new IaasError();
//		_error.setErrorId(asyncError.getErrorId());
//		_error.setErrorDate(asyncError.getErrorDate());
//		_error.setCorrelationId(asyncError.getErrorCid());
//		_error.setErrorInfo(asyncError.getErrorInfo());
//		return _error; 
//	}

	@Override
	public List<AsyncError> getErrorsToday() throws IllegalArgumentException {
		List<AsyncError> asyncErrorList = new ArrayList<AsyncError>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasError error : endpoint.getErrorsToday()) {
				asyncErrorList.add(toAsync(error));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncErrorList;
	}

	@Override
	public List<AsyncError> getErrorsYesterday() throws IllegalArgumentException {
		List<AsyncError> asyncErrorList = new ArrayList<AsyncError>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasError error : endpoint.getErrorsYesterday()) {
				asyncErrorList.add(toAsync(error));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncErrorList;
	}

	@Override
	public List<AsyncError> getErrorsLastWeek() throws IllegalArgumentException {
		List<AsyncError> asyncErrorList = new ArrayList<AsyncError>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasError error : endpoint.getErrorsLastWeek()) {
				asyncErrorList.add(toAsync(error));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncErrorList;

	}

	@Override
	public List<AsyncError> getErrorsLastMonth() throws IllegalArgumentException {
		List<AsyncError> asyncErrorList = new ArrayList<AsyncError>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasError error : endpoint.getErrorsLastMonth()) {
				asyncErrorList.add(toAsync(error));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncErrorList;

	}

	@Override
	public List<AsyncEvent> getEventsToday() throws IllegalArgumentException {
		List<AsyncEvent> asyncEventList = new ArrayList<AsyncEvent>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasEvent event : endpoint.getEventsToday()) {
				asyncEventList.add(toAsync(event));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncEventList;

	}

	@Override
	public List<AsyncEvent> getEventsYesterday() throws IllegalArgumentException {
		List<AsyncEvent> asyncEventList = new ArrayList<AsyncEvent>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasEvent event : endpoint.getEventsYesterday()) {
				asyncEventList.add(toAsync(event));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncEventList;
	}

	@Override
	public List<AsyncEvent> getEventsLastWeek() throws IllegalArgumentException {
		List<AsyncEvent> asyncEventList = new ArrayList<AsyncEvent>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasEvent event : endpoint.getEventsLastWeek()) {
				asyncEventList.add(toAsync(event));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncEventList;
	}

	@Override
	public List<AsyncEvent> getEventsLastMonth() throws IllegalArgumentException {
		List<AsyncEvent> asyncEventList = new ArrayList<AsyncEvent>();
		MessageSystemEndpointProxy endpoint = new MessageSystemEndpointProxy();
		
		try {
			for (IaasEvent event : endpoint.getEventsLastMonth()) {
				asyncEventList.add(toAsync(event));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return asyncEventList;
	}
	
}
