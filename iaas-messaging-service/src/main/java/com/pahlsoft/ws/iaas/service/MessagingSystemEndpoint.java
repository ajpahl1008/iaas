package com.pahlsoft.ws.iaas.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.pahlsoft.ws.iaas.dao.ErrorDao;
import com.pahlsoft.ws.iaas.dao.EventDao;
import com.pahlsoft.ws.iaas.generated.IaasError;
import com.pahlsoft.ws.iaas.generated.IaasEvent;

@Service
@WebService(name ="MessageSystemEndpoint",targetNamespace="http://iaas.ws.pahlsoft.com")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class MessagingSystemEndpoint extends SpringBeanAutowiringSupport {
	
	@Autowired
	EventDao eventDao;
	@Autowired
	ErrorDao errorDao;
	
	// Required to Autowire the DAOs into a JAX-WS service
	@PostConstruct
	public void init() {
	    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	@WebMethod
	public int insertEvent(@WebParam(name="eventInfo", targetNamespace="http://iaas.ws.pahlsoft.com") IaasEvent eventInfo) throws Exception {
		return eventDao.insertEvent(eventInfo);
	}

	@WebMethod
	@WebResult(name="eventsToday")
	public List<IaasEvent> getEventsToday() throws Exception {
		return eventDao.getEventsToday();
	}

	@WebMethod
	@WebResult(name="eventsYesterday")
	public List<IaasEvent> getEventsYesterday() throws Exception {
		return eventDao.getEventsYesterday();
	}
	
	@WebMethod
	@WebResult(name="eventsLastWeek")
	public List<IaasEvent> getEventsLastWeek() throws Exception {
		return eventDao.getEventsLastWeek();
	}

	@WebMethod
	@WebResult(name="eventsLastMonth")
	public List<IaasEvent> getEventsLastMonth() throws Exception {
		return eventDao.getEventsLastMonth();
	}
	
	@WebMethod
	public int insertError(@WebParam(name="errorInfo", targetNamespace="http://iaas.ws.pahlsoft.com") IaasError errorInfo) throws Exception {
		return errorDao.insertError(errorInfo);
	}
	
	@WebMethod
	@WebResult(name="errorsToday")
	public List<IaasError> getErrorsToday() throws Exception {
		return errorDao.getErrorsToday();
	}
	
	@WebMethod
	@WebResult(name="errorsYesterday")
	public List<IaasError> getErrorsYesterday() throws Exception {
		return errorDao.getErrorsYesterday();
	}
	
	@WebMethod
	@WebResult(name="errorsLastWeek")
	public List<IaasError> getErrorsLastWeek() throws Exception {
		return errorDao.getErrorsLastWeek();
	}
	
	@WebMethod
	@WebResult(name="errorsLastMonth")
	public List<IaasError> getErrorsLastMonth() throws Exception {
		return errorDao.getErrorsLastMonth();
	}
}
