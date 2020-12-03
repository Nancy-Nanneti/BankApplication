package com.bookapp.model.service;

import com.bookapp.model.entities.User;

public interface UserService {

	public  User getUser(String username, String password);

}
