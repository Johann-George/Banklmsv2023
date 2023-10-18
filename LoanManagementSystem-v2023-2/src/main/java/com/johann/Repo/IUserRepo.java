package com.johann.Repo;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.johann.model.User;

@Repository
public interface IUserRepo extends JpaRepositoryImplementation<User,Integer>
{
	//Spring Data JPA -- JpaRepositoryImplementation, 
	
	//CustomerRetrieve (Email or Phone) & Password -- JPQL
	@Query("from User where (email = ?1 or phoneNo = ?1) and password = ?2 and isActive = true")
	public User findByEmailPhoneAndPassword(String emailOrPhone, String password);
	
	//Get User by User ID
	@Query("from User where userID = ?1 and isActive = true")
	public User findByUserID(int userID);
	
	
	//Disable User
	@Modifying
	@Query("update User u set u.isActive=false where u.userID=?1")
	public void disableById(int userID);
	
	//Enable User
	@Modifying
	@Query("update User u set u.isActive=true where u.userID=?1")
	public void enableById(int userID);
	
}