package com.pahlsoft.ws.iaas.dao;

import java.util.ArrayList;
import java.util.List;

import com.pahlsoft.ws.iaas.generated.User;

public interface UserDao {
	public List<User> getUser(String userName);
	public List<User> getUsers();
	public int setUser(User user);
	public int deleteUsers(ArrayList<String> users);
	public int addUser(User user);
}
