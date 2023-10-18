package com.johann.Repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.johann.model.Login;

@Repository
public interface ILoginRepo extends CrudRepository<Login, Integer>{
	
	//custom method 
	
	@Query("from Login WHERE loginName=?1 AND password=?2")
	public Login findUserByNameAndPassword(String userName,String password); 

}
