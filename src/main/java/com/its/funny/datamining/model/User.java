package com.its.funny.datamining.model;


import java.io.Serializable;
import java.util.Date;


public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private Date register_time; 
	private String email;
	private int delflag;//删除标志，删除1，否则为0
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegister_time() {
		return register_time;
	}
	public void setRegister_time(Date register_time) {
		this.register_time = register_time;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	
}
