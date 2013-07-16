package com.pahlsoft.ws.iaas.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pahlsoft.ws.iaas.generated.Statistics;

public class StatisticRowMapper implements RowMapper<Statistics> {

	public Statistics mapRow(ResultSet rs, int rowNum) throws SQLException {
		Statistics stats = new Statistics();
		stats.setServerName(rs.getString("server_name"));
		stats.setServerUptime(rs.getString("server_uptime"));
		stats.setConextSwitching(rs.getString("server_context_switching"));
		stats.setServerLoad(rs.getString("server_load"));
		
		return stats;
	}

}
