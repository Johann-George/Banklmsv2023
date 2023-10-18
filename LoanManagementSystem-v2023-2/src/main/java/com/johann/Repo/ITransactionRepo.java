package com.johann.Repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.johann.model.Transaction;

@Repository
public interface ITransactionRepo extends JpaRepositoryImplementation<Transaction,Integer>{
	
	//Find by Transaction Id
	@Query("from Transaction where transactionId=?1")
	Transaction findByTransactionId(int transactionId);

	

	
}
