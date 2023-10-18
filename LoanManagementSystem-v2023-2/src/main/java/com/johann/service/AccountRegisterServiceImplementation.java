package com.johann.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johann.Repo.IAccountRegisterRepo;
import com.johann.model.AccountRegister;

@Service
public class AccountRegisterServiceImplementation implements IAccountRegisterService{

	
	@Autowired 
	private IAccountRegisterRepo accountRegisterRepo;
	
	//Find all account registers
	@Override
	public List<AccountRegister> findAllAccountRegisters() {
		
		return (List<AccountRegister>)accountRegisterRepo.findAll();
	}

	@Override
	public AccountRegister findAccountRegisterByAccountRegisterID(int AccountRegisterId) {
		AccountRegister areg=accountRegisterRepo.findAccountRegisterByAccountRegisterID(AccountRegisterId);
		if(areg!=null) {
			if(AccountRegisterId==(areg.getAccountRegisterId())) {
				return areg;
			}
			return null;
		}
		return null;
	}

	@Override
	public void deleteAccountRegister(int accountRegisterID) {
		accountRegisterRepo.deleteById(accountRegisterID);
		
	}

	//Add account register
	
	
	private static String generateAccountNo()
	{

		// 9 Digit Account No. only Digits allowed
		StringBuilder randomAccountNo = new StringBuilder("");

		// Keeping 1st digit from 1-9
		int digit = (int) (Math.random() * 9 + 1);
		randomAccountNo.append(digit);

		// Keeping 2nd digit onwards as 0-9
		for (int i = 0; i < 8; i++)
		{
			digit = (int) (Math.random() * 9);
			randomAccountNo.append(digit);
		}
		
		return randomAccountNo.toString();
	}

	@Transactional
	public AccountRegister addAccountRegister(AccountRegister accountRegister) {
		accountRegister.setAccountNumber(generateAccountNo());
		return accountRegisterRepo.save(accountRegister);
	}
	
	
	@Transactional
	@Override
	public AccountRegister updateAccountRegister(AccountRegister accountRegister) {
		return accountRegisterRepo.save(accountRegister);
	}
	
	
}
