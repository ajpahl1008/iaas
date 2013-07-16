package com.pahlsoft.iaas.ui.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface MessagingServiceAsync {
	// Getters
	void  getErrorsToday(AsyncCallback<List<AsyncError>> asyncCallback);
	void  getErrorsYesterday(AsyncCallback<List<AsyncError>> asyncCallback);
	void  getErrorsLastWeek(AsyncCallback<List<AsyncError>> asyncCallback);
	void  getErrorsLastMonth(AsyncCallback<List<AsyncError>> asyncCallback);

	void  getEventsToday(AsyncCallback<List<AsyncEvent>> asyncCallback);
	void  getEventsYesterday(AsyncCallback<List<AsyncEvent>> asyncCallback);
	void  getEventsLastWeek(AsyncCallback<List<AsyncEvent>> asyncCallback);
	void  getEventsLastMonth(AsyncCallback<List<AsyncEvent>> asyncCallback);
	
	// Setters: If you set them, remember they need to be ArrayList (not List) typed.
	
}

