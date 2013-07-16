package com.pahlsoft.ws.iaas.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pahlsoft.ws.iaas.dao.EventDao;
import com.pahlsoft.ws.iaas.generated.IaasEvent;
import com.pahlsoft.ws.iaas.mappers.EventRowMapper;

public class EventDaoImpl implements EventDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public Logger daoLog = Logger.getLogger(EventDaoImpl.class);
	
	@Override
	public int insertEvent(IaasEvent eventInfo) {
		String event_sql = "INSERT INTO iaas.events VALUES (default, ? , ? , ?)";
		daoLog.info("Added Event: " + eventInfo.getCorrelationId());
		return getJdbcTemplate().update(event_sql, new Object[] {
																	eventInfo.getEventDate(),
																	eventInfo.getCorrelationId(),
																	eventInfo.getEventInfo()});
	}

	@Override
	public List<IaasEvent> getEventsToday() {
		daoLog.info("Retrieve Events for Today");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = sdf.format(date); 
		String event_sql_today = "select * from iaas.events where event_date like '" + today + "%'"; 
		return getJdbcTemplate().query(event_sql_today, new EventRowMapper());
	}

	@Override
	public List<IaasEvent> getEventsYesterday() {
		daoLog.info("Retrieve Events for Yesterday");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -1); // subtract to get yesterday
		date = cal.getTime();
		String yesterday = sdf.format(date);
		String event_sql_today = "select * from iaas.events where event_date like '" + yesterday + "%'"; 
		return getJdbcTemplate().query(event_sql_today, new EventRowMapper());

	}

	@Override
	public List<IaasEvent> getEventsLastWeek() {
		daoLog.info("Retrieve Events for Last Week");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = sdf.format(date);
		today = today + "000000";
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -7); // subtract to get yesterday
		date = cal.getTime();
		String lastweek = sdf.format(date);
		lastweek=lastweek+"000000";  // Added Hours Minutes Seconds
		String event_sql_today = "select * from iaas.events where event_date >= " + lastweek + " and event_date < " + today; 
		return getJdbcTemplate().query(event_sql_today, new EventRowMapper());
	}

	@Override
	public List<IaasEvent> getEventsLastMonth() {
		daoLog.info("Retrieve Events for Last Month");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String today = sdf.format(date);
		today = today + "000000";
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -1); // subtract to get yesterday
		date = cal.getTime();
		String lastmonth = sdf.format(date);
		lastmonth=lastmonth+"000000";  // Added Hours Minutes Seconds
		String event_sql_today = "select * from iaas.events where event_date >= " + lastmonth + " and event_date < " + today; 
		return getJdbcTemplate().query(event_sql_today, new EventRowMapper());
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
