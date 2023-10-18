package com.johann.Repo;

//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.johann.model.AccountRegister;
//import com.johann.model.LoanRequest;

@Repository
public interface IAccountRegisterRepo extends JpaRepositoryImplementation<AccountRegister,Integer>{

	
	//Find by AccountRegisterId
	@Query("from AccountRegister where accountRegisterId=?1")
	public AccountRegister findAccountRegisterByAccountRegisterID(int accountRegisterID);
	
	
//	//update account register
//	@Modifying
//	@Query(value="update AccountRegister set accountNumber=floor(rand() * 1000000) where accountId=?1", nativeQuery = true)
//	public Integer updateAccountRegister(AccountRegister accountId);
}
