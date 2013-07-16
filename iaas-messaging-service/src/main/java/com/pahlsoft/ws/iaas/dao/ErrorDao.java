package com.pahlsoft.ws.iaas.dao;

import java.util.List;

import com.pahlsoft.ws.iaas.generated.IaasError;

public interface ErrorDao {
	// Setters
	public int insertError(IaasError error);
	// Getters
	public List<IaasError>  getErrorsToday();
	public List<IaasError>  getErrorsYesterday();
	public List<IaasError>  getErrorsLastWeek();
	public List<IaasError>  getErrorsLastMonth();
	
	
}
