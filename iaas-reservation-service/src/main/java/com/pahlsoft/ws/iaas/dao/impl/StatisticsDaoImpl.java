package com.pahlsoft.ws.iaas.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pahlsoft.ws.iaas.dao.StatisticsDao;
import com.pahlsoft.ws.iaas.generated.Statistics;

import com.pahlsoft.ws.iaas.mappers.StatisticRowMapper;

public class StatisticsDaoImpl implements StatisticsDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public Logger daoLog = Logger.getLogger(StatisticsDaoImpl.class);
	
	public Statistics getServerStats(String serverName) {
		daoLog.info("Querying Stats for Server:" + serverName );
		serverName = StringEscapeUtils.escapeSql(serverName);
		String sql = "select * from stats_j03 where server_name=?";
		try {
			return getJdbcTemplate().queryForObject(sql, new Object[] {serverName}, new StatisticRowMapper());
		} catch (Exception e) {
			daoLog.info("No Statistics in Query for server: " + serverName);
			return new Statistics();
		}
		
	}
	
	public List<Statistics> getAllServerStats() {
		String sql = "select * from stats_j03";
		daoLog.info("Querying Statistics for All Servers");
		List<Statistics> statistics = new ArrayList<Statistics>();
		 
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map<?, ?> row : rows) {
			Statistics statistic = new Statistics();
			
			statistic.setServerName((String)row.get("server_name"));
			statistic.setServerUptime((String)row.get("server_uptime"));
			statistic.setConextSwitching((String)row.get("server_context_switching"));
			statistic.setServerLoad((String)row.get("server_load"));
			
			statistics.add(statistic);
		}
		return statistics;
	}

	public boolean setServerStats(Statistics serverStats) {
		
			if (checkStatsExist(serverStats.getServerName())) {
				updateStatistics(serverStats);
				daoLog.info("Updated Statistics for Server: " + serverStats.getServerName());
			} else {
				insertStatistics(serverStats);
				daoLog.info("Added Statistics for Server: " + serverStats.getServerName());
			}
			
			return true;
		}
		
		private int insertStatistics(Statistics serverStatistics) {
			String server_sql = "INSERT INTO iaas.statistics VALUES (default, ?, ?, ?, ?)";
			
			return getJdbcTemplate().update(server_sql, new Object[] { getServerId(serverStatistics.getServerName()),
																	   serverStatistics.getServerUptime(),
																	   serverStatistics.getConextSwitching(),
																	   serverStatistics.getServerLoad()});
		}
		
		private int updateStatistics(Statistics serverStatistics) {
			String server_sql = "UPDATE iaas.statistics set server_uptime=?,server_context_switching=?,server_Load=? where server_id=?";
			
			return getJdbcTemplate().update(server_sql, new Object[] { serverStatistics.getServerUptime(),
																	   serverStatistics.getConextSwitching(),
																	   serverStatistics.getServerLoad(),
																	   getServerId(serverStatistics.getServerName()),
																	   });
		}
		
		public int deleteServerStatistics(String serverName) {
			String delete_sql = "DELETE FROM iaas.statistics where server_id=?";
			try {
				daoLog.info("Deleting Statistics for server " + serverName);
				return getJdbcTemplate().update(delete_sql, new Object[] {getServerId(serverName)});
			} catch (Exception e) {
				daoLog.info("Statistics for server " + serverName + " do not exist.");
				return 0;
			}
		}
		
		private boolean checkStatsExist(String serverName) {
			String sql = "select * from stats_j03 where server_name=?";
			Statistics _stats = null;
			try {
				_stats = getJdbcTemplate().queryForObject(sql, new Object[] {serverName}, new StatisticRowMapper());
			} catch (Exception e) {
				daoLog.info("No Statistics in Query for server: " + serverName);
			}
			if (_stats != null) {
				return true;
			} else {
				return false;
			}
		}
	
		
		private int getServerId(String serverName) {
			String sql = "select id from iaas.servers where server_name=?";
			return getJdbcTemplate().queryForInt(sql,new Object[] {serverName} );
		}


	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
