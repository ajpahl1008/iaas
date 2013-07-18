package com.pahlsoft.ws.iaas.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pahlsoft.ws.iaas.generated.IaasEvent;


public class EventRowMapper implements RowMapper<IaasEvent>{

	public IaasEvent mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			IaasEvent event = new IaasEvent();
						
			event.setEventId(rs.getInt("eventID"));
			event.setEventDate(rs.getString("event_date"));
			event.setCorrelationId(rs.getString("event_cid"));
			event.setEventInfo(rs.getString("event_info"));
			
			return event;
	}
	
}
