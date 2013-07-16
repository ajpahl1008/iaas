package com.pahlsoft.iaas.ui.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("messaging")
public interface MessagingService extends RemoteService {
	
	// Getters
	List<AsyncError>  getErrorsToday() throws IllegalArgumentException;
	List<AsyncError>  getErrorsYesterday() throws IllegalArgumentException;
	List<AsyncError>  getErrorsLastWeek() throws IllegalArgumentException;
	List<AsyncError>  getErrorsLastMonth() throws IllegalArgumentException;
	
	List<AsyncEvent>  getEventsToday() throws IllegalArgumentException;
	List<AsyncEvent>  getEventsYesterday() throws IllegalArgumentException;
	List<AsyncEvent>  getEventsLastWeek() throws IllegalArgumentException;
	List<AsyncEvent>  getEventsLastMonth() throws IllegalArgumentException;
	
	
}
