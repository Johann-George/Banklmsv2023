package com.johann.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "TblTransaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	private String transactionAmount;
	private Date transactionDate;
	
	
	//@JoinColumn				//LoanRequest.loanID = Loan.loanID
	@JoinColumn(name = "userID")
	@ManyToOne
	private User user;	
	
	
	//AccounRegister
	//@JoinColumn				//User.roleId = Role.roleId
	@JoinColumn(name = "accountRegisterId")
	@ManyToOne
	private AccountRegister accountRegister;

		
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transactionId, String transactionAmount, Date transactionDate) {
		super();
		this.transactionId = transactionId;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
	}

	public Transaction(int transactionId, String transactionAmount, Date transactionDate, User user,
			AccountRegister accountRegister) {
		super();
		this.transactionId = transactionId;
		this.transactionAmount = transactionAmount;
		this.transactionDate = transactionDate;
		this.user = user;
		this.accountRegister = accountRegister;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public AccountRegister getAccountRegister() {
		return accountRegister;
	}

	public void setAccountRegister(AccountRegister accountRegister) {
		this.accountRegister = accountRegister;
	}

	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionAmount=" + transactionAmount
				+ ", transactionDate=" + transactionDate + ", user=" + user + ", accountRegister=" + accountRegister
				+ "]";
	}

	

}