package com.bookapp.model.dao;

import java.util.*;

import com.bookapp.model.entities.User;

public interface UserDao {
	public List<User> getAllUser();
	public  User updateUser(User user);
	public  User delUser(User user);
	public  User addUser(User user);
	public  User getUser(String username, String password);

}
