package com.johann.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johann.Repo.ITransactionRepo;
import com.johann.model.Transaction;

@Service
public class TransactionServiceImplementation implements ITransactionService{

	@Autowired
	private ITransactionRepo transactionRepo;
	
	//Find all Transactions
	@Override
	public List<Transaction> findAllTransactions() {
		return (List<Transaction>)transactionRepo.findAll();
	}
	
	//Find transaction by Id
	@Override
	public Transaction findByTransactionId(int transactionId) {
		Transaction atransaction=transactionRepo.findByTransactionId(transactionId);
		if(atransaction!=null) {
			if(transactionId==(atransaction.getTransactionId())) {
				return atransaction;
			}
			return null;
		}
		return null;
	}

	//Add a transaction
	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
	}

	//Update a transaction
	@Transactional
	@Override
	public Transaction updateTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
	}

	//Delete a transaction
	@Override
	public void deleteTransaction(int transactionId) {
		transactionRepo.deleteById(transactionId);
		
	}
	
}
