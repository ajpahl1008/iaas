package com.pahlsoft.ws.iaas.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pahlsoft.ws.iaas.dao.ErrorDao;
import com.pahlsoft.ws.iaas.generated.IaasError;
import com.pahlsoft.ws.iaas.mappers.ErrorRowMapper;
import com.pahlsoft.ws.iaas.mappers.EventRowMapper;

public class ErrorDaoImpl implements ErrorDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public Logger daoLog = Logger.getLogger(ErrorDaoImpl.class);
	

	@Override
	public int insertError(IaasError errorInfo) {
		String event_sql = "INSERT INTO iaas.errors VALUES (default, ? , ? , ?)";
		daoLog.info("Added Event: " + errorInfo.getCorrelationId());
		return getJdbcTemplate().update(event_sql, new Object[] {
																	errorInfo.getErrorDate(),
																	errorInfo.getCorrelationId(),
																	errorInfo.getErrorInfo()});
	}

	@Override
	public List<IaasError> getErrorsToday() {
		daoLog.info("Retrieve Errors for Today");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = sdf.format(date); 
		String error_sql_today = "select * from iaas.errors where error_date like '" + today + "%'"; 
		return getJdbcTemplate().query(error_sql_today, new ErrorRowMapper());
	}

	@Override
	public List<IaasError> getErrorsYesterday() {
		daoLog.info("Retrieve Errors for Yesterday");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -1); // subtract to get yesterday
		date = cal.getTime();
		String yesterday = sdf.format(date);
		String error_sql_today = "select * from iaas.errors where error_date like '" + yesterday + "%'"; 
		return getJdbcTemplate().query(error_sql_today, new ErrorRowMapper());
	}

	@Override
	public List<IaasError> getErrorsLastWeek() {
		daoLog.info("Retrieve Errors for Last Week");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = sdf.format(date);
		today = today + "000000";
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -7); 
		date = cal.getTime();
		String lastweek = sdf.format(date);
		lastweek=lastweek+"000000";  // Added Hours Minutes Seconds
		String error_sql_today = "select * from iaas.errors where error_date >= " + lastweek + " and error_date < " + today; 
		return getJdbcTemplate().query(error_sql_today, new ErrorRowMapper());
	}

	@Override
	public List<IaasError> getErrorsLastMonth() {
		daoLog.info("Retrieve Errors for Last Month");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = sdf.format(date);
		today = today + "000000";
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -1); 
		date = cal.getTime();
		String lastmonth = sdf.format(date);
		lastmonth=lastmonth+"000000";  // Added Hours Minutes Seconds
		String error_sql_today = "select * from iaas.errors where error_date >= " + lastmonth + " and error_date < " + today; 
		return getJdbcTemplate().query(error_sql_today, new ErrorRowMapper());
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);	
	}

	

}
