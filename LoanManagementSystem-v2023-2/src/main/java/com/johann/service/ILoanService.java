package com.johann.service;

import com.johann.common.APIResponse;

public interface ILoanService {
	public APIResponse findLoanByLoanId(int loanID);
}
