package com.its.funny.datamining.dao;


import java.util.List;

import com.its.funny.datamining.model.User;

public interface UserMapper {

	int insertUser(User user);
	List<User> getAllUsers();
	User getUserByUserName(User user);
	
}
