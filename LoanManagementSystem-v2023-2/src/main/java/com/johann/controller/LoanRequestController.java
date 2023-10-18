package com.johann.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johann.model.LoanRequest;
import com.johann.service.ILoanRequestService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanRequestController{

	@Autowired
	private ILoanRequestService loanRequestService;
	
	//Find all loan requests
	@GetMapping("/loanrequests")
	public List<LoanRequest> findAllLoanRequest(){
		return loanRequestService.findAllLoanRequests();
	}
	
	//Search loan request by loan request ID
	@GetMapping("/loanrequests/{loanRequestID}")
	public LoanRequest findByLoanRequestId(@PathVariable int loanRequestID) {
		return loanRequestService.findByLoanRequestId(loanRequestID);
	}
	
	//Add loan request
	@PostMapping("/loanrequests")
	public ResponseEntity<LoanRequest> addLoanRequest(@RequestBody LoanRequest loanRequest)
	{
		System.out.println("Inserting a Record");
		return new ResponseEntity<LoanRequest>(loanRequestService.addLoanRequest(loanRequest),HttpStatus.OK);
	}
	
	//Update loan request
	@PutMapping("/loanrequests")
	public ResponseEntity<LoanRequest> udpateLoanRequest(@RequestBody LoanRequest loanRequest)
	{
		System.out.println("Inserting a Record");
		return new ResponseEntity<LoanRequest>(loanRequestService.updateLoanRequest(loanRequest),HttpStatus.OK);
	}
	
	
	//1- Status Update Loan Request - Administrator
	//	Update for a specific LoanRequestId
	@PutMapping("/loanrequests/{loanRequestId}/{statusId}")
	public ResponseEntity<Integer> updateLoanRequestStatus(@PathVariable int loanRequestId, @PathVariable int statusId) {
				
		int updatedStatusId = loanRequestService.updateStatusLoanRequest(statusId, loanRequestId);
		return new ResponseEntity<Integer>(updatedStatusId, HttpStatus.OK);
				
		//return new ResponseEntity<>(loanRequestService.updateStatusLoanRequest(statusId, loanRequestId), HttpStatus.OK);
	}
	//Disable loan request
//	@PutMapping("/loanrequests/{loanRequestID}")
//	public void disableLoanRequest(@PathVariable int loanRequestID) {
//		loanRequestService.disableLoanRequest(loanRequestID);
//	}

}
