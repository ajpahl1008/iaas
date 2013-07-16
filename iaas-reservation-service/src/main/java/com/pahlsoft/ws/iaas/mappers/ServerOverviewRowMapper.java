package com.pahlsoft.ws.iaas.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pahlsoft.ws.iaas.generated.Category;
import com.pahlsoft.ws.iaas.generated.OperatingSystemEnum;
import com.pahlsoft.ws.iaas.generated.Parent;
import com.pahlsoft.ws.iaas.generated.Server;
import com.pahlsoft.ws.iaas.generated.Status;
import com.pahlsoft.ws.iaas.generated.User;

public class ServerOverviewRowMapper implements RowMapper<Server>{

	public Server mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Server server = new Server();
			User userInfo = new User();
			Parent parent = new Parent();
			
			server.setServerId(rs.getInt("id"));
			server.setServerName(rs.getString("server_name"));
			server.setServerStatus(Status.fromValue(rs.getString("status")));
			server.setStartDate(rs.getString("start_date"));
			server.setStartDate(rs.getString("expiration_date"));
			server.setServerCategory(Category.fromValue(rs.getString("category")));
			userInfo.setFirstName(rs.getString("first_name"));
			userInfo.setLastName(rs.getString("last_name"));
			userInfo.setPhoneNumber(rs.getString("phone_number"));
			parent.setParentName(rs.getString("parent_name"));
			server.setServerUser(userInfo);
			userInfo.setLoginId(rs.getString("login"));
			server.setOperatingSystem(OperatingSystemEnum.fromValue(rs.getString("os_name")));

			return server;
	}
	

}
