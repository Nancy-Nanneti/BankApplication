package com.bookapp.model.dao.Impl;

import com.bookapp.model.dao.UserDao;
import com.bookapp.model.entities.User;
import com.bookapp.model.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	 
    public UserDao getUserDao()
    {
        return this.userDao;
    }
 
    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
	
	@Override
	public User getUser(String username, String password) {

		return null;
	}
	

}
