package com.johann.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johann.Repo.ILoanRequestRepo;
import com.johann.model.LoanRequest;

@Service
public class LoanRequestServiceImplementation implements ILoanRequestService{
	
	@Autowired
	private ILoanRequestRepo loanRequestRepo;
	
	
	@Override
	public List<LoanRequest> findAllLoanRequests() {
		return (List<LoanRequest>)loanRequestRepo.findAll();
	}

	@Override
	public LoanRequest findByLoanRequestId(int loanRequestID) {
		LoanRequest lreq=loanRequestRepo.findByLoanRequestId(loanRequestID);
		if(lreq!=null) {
			if(loanRequestID==(lreq.getLoanRequestID())) {
				return lreq;
			}
			return null;
		}
		return null;
	}

	//Add Loan Request
	@Override
	@Transactional
	public LoanRequest addLoanRequest(LoanRequest loanRequest) {
		
		return loanRequestRepo.save(loanRequest);
	}
	//Added a comment
	//Update Loan Request
	@Override
	@Transactional
	public LoanRequest updateLoanRequest(LoanRequest loanRequest) {
		
		return loanRequestRepo.save(loanRequest);
	}
	
	//update a status for loanrequest
	@Override
	@Transactional
	public Integer updateStatusLoanRequest(int statusId, int loanRequestId) {
		
		return loanRequestRepo.updateStatusLoanRequest(statusId, loanRequestId);

	}

	
	
	

	
//	@Override
//	@Transactional
//	public void disableLoanRequest(int loanRequestID) {
//		
//		loanRequestRepo.disableLoanReqeust(loanRequestID);
//	}
	
}
