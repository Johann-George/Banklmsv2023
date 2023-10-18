package com.johann.service;

import java.util.List;

import com.johann.model.Transaction;

public interface ITransactionService {
	
	List<Transaction> findAllTransactions();
	
	Transaction findByTransactionId(int transactionId);

	Transaction addTransaction(Transaction transaction);

	Transaction updateTransaction(Transaction transaction);

	void deleteTransaction(int transactionId);

}
