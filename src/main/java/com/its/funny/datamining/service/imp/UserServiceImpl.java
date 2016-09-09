package com.its.funny.datamining.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.its.funny.datamining.dao.UserMapper;
import com.its.funny.datamining.model.User;
import com.its.funny.datamining.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper mapper;
	@Override
	@Transactional("transactionManager")
	public int insertUser(User user) {
		
		return mapper.insertUser(user);
	}
	@Override
	public List<User> getAllUsers() {
		return mapper.getAllUsers();
	}
	@Override
	public User getUserByUserName(User user) {
		
		return mapper.getUserByUserName(user);
	}

}
