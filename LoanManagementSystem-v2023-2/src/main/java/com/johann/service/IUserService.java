package com.johann.service;

import java.util.List;

import com.johann.common.APIResponse;
import com.johann.model.User;

public interface IUserService {
	
	//List all Users
	List<User> findAllUsers();
	
	//Find By Email or Phone & password
	User findByEmailPhoneAndPassword(String emailOrPhone, String password);
	
	//Insert User
	User addUser(User user);
	
	//Update User
	User updateUser(User user);
	
	//Delete(Actually Disable) User
	void deleteUser(int userId);
	
}
