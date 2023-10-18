package com.johann.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johann.common.APIResponse;
import com.johann.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {
	@Autowired
	private ILoginService loginService;

//	@GetMapping("/users")
//    public String welcome() {
//        return "Welcome to my Spring Boot REST API!";
//    }
	
	@GetMapping("/logins/{loginName}&{password}")
	public ResponseEntity<APIResponse> findUserByNameAndPassword(@PathVariable String loginName,@PathVariable String password) {

		APIResponse apiResponse = loginService.findUserByNameAndPassword(loginName,password);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
}