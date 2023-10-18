package com.johann.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johann.model.Transaction;
import com.johann.service.ITransactionService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TransactionController {
	
	@Autowired
	private ITransactionService transactionService;
	
	//Find all transactions
	@GetMapping("/transactions")
	public List<Transaction> findAllTransactions(){
		return transactionService.findAllTransactions();
	}
	
	
	//Find Transactions by transaction ID
	@GetMapping("/transactions/{transactionId}")
	public Transaction findByTrasactionId(@PathVariable int transactionId) {
		return transactionService.findByTransactionId(transactionId);
	}
	
	//Add a transaction
	@PostMapping("/transactions")
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction)
	{
		System.out.println("Inserting a Record");
		return new ResponseEntity<Transaction>(transactionService.addTransaction(transaction),HttpStatus.OK);
	}
	
	//Update a transaction
	@PutMapping("/transactions")
	public ResponseEntity<Transaction> updateTransaction(@RequestBody Transaction transaction)
	{
		System.out.println("Inserting a Record");
		return new ResponseEntity<Transaction>(transactionService.updateTransaction(transaction),HttpStatus.OK);
	}
	
	//Disable a transaction
	@PutMapping("/transactions/{transactionId}")
	public void deleteTransaction(@PathVariable int transactionId) {
		transactionService.deleteTransaction(transactionId);
	}
	
}
