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

import com.johann.Repo.IAccountRegisterRepo;
import com.johann.model.AccountRegister;
import com.johann.model.User;
import com.johann.service.IAccountRegisterService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AccountRegisterController {
	
	@Autowired
	private IAccountRegisterService accountRegisterService;
	private IAccountRegisterRepo accountRegisterRepo;
	//Search all AccountRegister
	@GetMapping("/accountregisters")
	public List<AccountRegister> findAllAccountRegisters(){
		return accountRegisterService.findAllAccountRegisters();
	}
	
	//Search Account Register By id
	@GetMapping("/accountregisters/{accountRegisterID}")
	public AccountRegister findAccountRegisterByAccountRegisterID(@PathVariable int accountRegisterID) {
		return accountRegisterService.findAccountRegisterByAccountRegisterID(accountRegisterID);
	}
	
	//Add Account Register by Account id
	@PostMapping("/accountregisters")
	public ResponseEntity<AccountRegister> addAccountRegister(@RequestBody AccountRegister accountRegister){
		return new ResponseEntity<AccountRegister>(accountRegisterService.addAccountRegister(accountRegister),HttpStatus.OK);
	}
	
	//Update User
	@PutMapping("/accountregisters")
	public ResponseEntity<AccountRegister> updateAccountRegister(@RequestBody AccountRegister accountRegister){
		return new ResponseEntity<AccountRegister>(accountRegisterService.addAccountRegister(accountRegister),HttpStatus.OK);
	}
	
	//Delete User
	@PutMapping("/accountregisters/{accountregisterID}")
	public void deleteAccountRegister(@PathVariable int accountRegisterID) {
		accountRegisterService.deleteAccountRegister(accountRegisterID);
	}
}
