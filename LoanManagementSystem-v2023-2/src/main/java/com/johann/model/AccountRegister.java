package com.johann.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TblAccountRegister")
public class AccountRegister {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountRegisterId;
	
	@Column(nullable = false, unique = true) 	// AutoGenerate 9 Digits
	private String accountNumber;
	
	@Column(nullable = false)
	private String nominee;
	
	
	//AccountRegister.loanRequestID = LoanRequest.loanRequestID
	@JoinColumn(name = "loanRequestID")
	@ManyToOne
	private LoanRequest loanRequest;	
	

	//AccountRegister.accountId = Account.accountId
	@JoinColumn(name = "accountId")
	@ManyToOne
	private Account account;
	
	
	//	List of transaction
	// For One LoanAccount Many Transactions
	@JsonIgnore					//Avoid Recursive
	@OneToMany(mappedBy = "accountRegister", cascade = CascadeType.ALL)	//One Role Many Users
	private List<Transaction> transactions;

	
	public AccountRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AccountRegister(int accountRegisterId, String accountNumber, String nominee) {
		super();
		this.accountRegisterId = accountRegisterId;
		this.accountNumber = accountNumber;
		this.nominee=nominee;
	}
	
	
	
	public AccountRegister(int accountRegisterId, String accountNumber, String nominee
			, LoanRequest loanRequest,
			Account account) {
		super();
		this.accountRegisterId = accountRegisterId;
		this.accountNumber = accountNumber;
		this.nominee = nominee;
		this.loanRequest = loanRequest;
		this.account = account;
	}

	public int getAccountRegisterId() {
		return accountRegisterId;
	}

	public void setAccountRegisterId(int accountRegisterId) {
		this.accountRegisterId = accountRegisterId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public LoanRequest getLoanRequest() {
		return loanRequest;
	}

	public void setLoanRequest(LoanRequest loanRequest) {
		this.loanRequest = loanRequest;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
	@Override
	public String toString() {
		return "AccountRegister [accountRegisterId=" + accountRegisterId + ", accountNumber=" + accountNumber
				+ ", nominee=" + nominee + ", loanRequest=" + loanRequest + ", account=" + account + ", transactions="
				+ transactions + "]";
	}

}