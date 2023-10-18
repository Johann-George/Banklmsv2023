package com.johann.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johann.Repo.ILoanRepo;

import com.johann.common.APIResponse;
import com.johann.model.Loan;


@Service
public class LoanServiceImplementation implements ILoanService{
	@Autowired
	private ILoanRepo loanRepository;
	@Autowired
	private APIResponse apiResponse;
	
	@Override
	public APIResponse findLoanByLoanId(int loanID) {
		// verify user exist or not
		Loan loan = loanRepository.findLoanByLoanId(loanID);
		if (loan == null) {
			apiResponse.setStatus(401);
			apiResponse.setData("Invalid Credentials!!");
			return apiResponse;
		}

		// credentials are correct, thenL

		//String token = jwtUtil.generateJwt(user);
		Map<String, Object> data = new HashMap<String, Object>();
//		data.put("ACCESSTOKEN", token);
		data.put("LoanId", loan.getLoanID());
		data.put("LoanType", loan.getLoanType());

		apiResponse.setStatus(200);
		apiResponse.setData(data);
		
		return apiResponse;
	}
}
