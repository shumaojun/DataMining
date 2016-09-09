package com.its.funny.datamining.service;


import java.util.List;

import com.its.funny.datamining.model.User;

public interface UserService {

	int insertUser(User user);
	List<User> getAllUsers();
	User getUserByUserName(User user);
}
