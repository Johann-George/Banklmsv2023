package com.johann.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.johann.model.LoanRequest;

public interface ILoanRequestService {
	
	//List all LoanRequests
	List<LoanRequest> findAllLoanRequests();
	
	//Find by Loan Request ID
	LoanRequest findByLoanRequestId(int loanRequestID);
	
	//Add Loan Request
	LoanRequest addLoanRequest(LoanRequest loanRequest);

	//Update Loan Reqeust
	LoanRequest updateLoanRequest(LoanRequest loanRequest);
	
	//Update Loan Request
//	LoanRequest updateLoanRequest(int statusId,int loanRequestId);
	
	//1- Status Update Loan Request - Administrator
	Integer updateStatusLoanRequest(int statusId, int loanRequestId);
	
	//Disable Loan Request
	//void disableLoanRequest(int loanRequestID);
	
}
