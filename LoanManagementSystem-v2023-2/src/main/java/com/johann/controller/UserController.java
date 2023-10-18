package com.johann.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johann.common.APIResponse;
import com.johann.model.User;
import com.johann.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class UserController {
	@Autowired
	private IUserService userService;

//	@GetMapping("/users")
//    public String welcome() {
//        return "Welcome to my Spring Boot REST API!";
//    }
	@GetMapping("/users")
	public List<User> findAllUsers(){
		return userService.findAllUsers();
	}
	
	@GetMapping("/userlogins/{emailOrPhone}&{password}")
	public User findUserByEmailPhoneAndPassword(@PathVariable String emailOrPhone,@PathVariable String password) {
		System.out.println("Inside Controller");
		return userService.findByEmailPhoneAndPassword(emailOrPhone,password);
	}
	
	//Add User
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		System.out.println("Inserting a Record");
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.OK);
	}
	
				
	//Update User
	@PutMapping("/users")
	public User updateUser(@RequestBody User user)
	{
		System.out.println("Updating a Record");
		return userService.updateUser(user);
	}
				
	//Delete(Actually Disable) User
	@PutMapping("/users/{userID}")
	public void deleteUser(@PathVariable int userID)
	{
		System.out.println("Disabling the record");
		userService.deleteUser(userID);
					
	}
//	public ResponseEntity<APIResponse> findUserByNameAndPassword(@PathVariable String userName,
//			@PathVariable String password) {
//
//		APIResponse apiResponse = userService.findUserByNameAndPassword(userName, password);
//
//		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
//	}
}
