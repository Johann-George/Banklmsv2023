package com.johann.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.johann.model.Loan;
import com.johann.model.Login;

public interface ILoanRepo extends JpaRepository<Login,Integer>{
	@Query("from Loan where loan_id=?1")
	public Loan findLoanByLoanId(int loanID);
}
