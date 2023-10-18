package com.johann.service;

import java.util.List;

import javax.transaction.Transactional;

import com.johann.model.AccountRegister;

public interface IAccountRegisterService {
	
	
	
	//List all Account registers
	List<AccountRegister> findAllAccountRegisters();
	
	//Find by account register ID
	AccountRegister findAccountRegisterByAccountRegisterID(int AccountRegisterId);
	
	//Add account register
	AccountRegister addAccountRegister(AccountRegister accountRegister);
	
	//Delete account register
	void deleteAccountRegister(int accountRegisterID);

	//Update account register
	AccountRegister updateAccountRegister(AccountRegister accountRegister);
	
}
