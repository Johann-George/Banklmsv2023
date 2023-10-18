package com.johann.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TblLoan")
public class Loan
{
	
	//Declare Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanID;
	private String loanType;
	private double interest;
	
//	//For One Loan Many LoanRequests
//	@JsonIgnore					//Avoid Recursive
//	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL)	//One Loan Many LoanRequest
//	private List<LoanRequest> loanRequests;

	//Default Constructor
	public Loan()
	{
		super();
	}

	//Parameterized Constructor
	public Loan(int loanID, String loanType, double interest)
	{
		super();
		this.loanID = loanID;
		this.loanType = loanType;
		this.interest = interest;
	}

	
	//Getters & Setters
	public int getLoanID() {
		return loanID;
	}

	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	//Override toString()
	@Override
	public String toString() {
		return String.format("Loan [loanID=%s, loanType=%s, interest=%s]", loanID, loanType, interest);
	}

}