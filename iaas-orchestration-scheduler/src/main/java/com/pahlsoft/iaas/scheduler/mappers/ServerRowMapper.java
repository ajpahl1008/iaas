package com.pahlsoft.iaas.scheduler.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pahlsoft.ws.iaas.generated.Category;
import com.pahlsoft.ws.iaas.generated.User;
import com.pahlsoft.ws.iaas.generated.Server;
import com.pahlsoft.ws.iaas.generated.Status;


public class ServerRowMapper implements RowMapper<Server>{

	public Server mapRow(ResultSet rs, int rowNum) throws SQLException {
			Server server = new Server();
			User userInfo = new User();
			
			server.setServerName(rs.getString("server_name"));
			server.setServerStatus(Status.fromValue(rs.getString("status")));
			server.setStartDate(rs.getString("start_date"));
			server.setStartDate(rs.getString("expiration_date"));
			server.setServerCategory(Category.fromValue(rs.getString("category")));
			userInfo.setFirstName(rs.getString("first_name"));
			userInfo.setLastName(rs.getString("last_name"));
			userInfo.setPhoneNumber(rs.getString("phone_number"));
			userInfo.setPhoneNumber(rs.getString("login"));
			server.setServerUser(userInfo);
			
			return server;
	}
	

}
