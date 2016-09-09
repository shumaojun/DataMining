package com.its.funny.datamining.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.its.funny.datamining.model.User;
import com.its.funny.datamining.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController{
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/insertUser", method = RequestMethod.GET)
	public String insertPage(ModelMap model) {
		User user = insert();
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		System.out.println("insert　Success!");
		return "addUser";
	}
	public User insert() {
		User user = new User();
		user.setUsername(Math.random()+"110");
		user.setPassword("12345");
		user.setRegister_time(new Date());
		user.setDelflag(0);
		userService.insertUser(user);
		return user;
	}
	
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
}
