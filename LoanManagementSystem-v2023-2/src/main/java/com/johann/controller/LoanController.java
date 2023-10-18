package com.johann.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johann.common.APIResponse;
import com.johann.service.ILoanService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoanController {
	@Autowired
	private ILoanService loanService;

	@GetMapping("/users/{loanID}")
	public ResponseEntity<APIResponse> findLoanByLoanId(@PathVariable int loanID) {

		APIResponse apiResponse = loanService.findLoanByLoanId(loanID);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}
}
