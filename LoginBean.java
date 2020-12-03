package com.bookapp.web.formbeans;

import javax.validation.constraints.NotEmpty;

public class LoginBean {
	
	@NotEmpty(message="username can not be null")
	private String username;
	
	@NotEmpty(message="password can not be null")
	private String password;
	
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
	

}
