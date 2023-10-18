package com.johann.DTO;

public class LoanRequestDTO
{
	// Declare Fields
		private double amount;
		private int tenure;
		private String sourceOfIncome;
		private String govtID;
		private int userID;
		private int loanID;
		private int loginID;
		private int accountRegisterID;
		private boolean isSettled;
		
		//Default Constructor
		public LoanRequestDTO()
		{
			super();
		}
		
		//Parameterized Constructor
		public LoanRequestDTO(double amount, int tenure, String sourceOfIncome, String govtID, int userID, 
				int loanID, int loginID,int accountRegisterID,boolean isSettled)
		{
			this.amount = amount;
			this.tenure = tenure;
			this.sourceOfIncome = sourceOfIncome;
			this.govtID = govtID;
			this.userID = userID;
			this.loanID = loanID;
			this.loanID=loginID;
			this.accountRegisterID=accountRegisterID;
			this.isSettled=isSettled;
		}
		
		//Getters & Setters
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public int getTenure() {
			return tenure;
		}
		public void setTenure(int tenure) {
			this.tenure = tenure;
		}
		public String getSourceOfIncome() {
			return sourceOfIncome;
		}
		public void setSourceOfIncome(String sourceOfIncome) {
			this.sourceOfIncome = sourceOfIncome;
		}
		public String getGovtID() {
			return govtID;
		}
		public void setGovtID(String govtID) {
			this.govtID = govtID;
		}
		public int getUserID() {
			return userID;
		}
		public void setUserID(int userID) {
			this.userID = userID;
		}
		public int getLoanID() {
			return loanID;
		}
		public void setLoanID(int loanID) {
			this.loanID = loanID;
		}
		
		public int getLoginID() {
			return loginID;
		}
		public void setLoginID(int loanID) {
			this.loginID = loginID;
		}
		
		public int getAccountRegisterID() {
			return accountRegisterID;
		}

		public void setAccountRegisterID(int accountRegisterID) {
			this.accountRegisterID = accountRegisterID;
		}
		
		public boolean isSettled() {
			return isSettled;
		}

		public void setSettled(boolean isSettled) {
			this.isSettled = isSettled;
		}
		
		//Overriding toString()
		@Override
		public String toString() { //Tabular Format
			return String.format(
					"LoanRequestDTO [amount=%s, tenure=%s, sourceOfIncome=%s, govtID=%s, UserID=%s, loanID=%s, "
					+ "getAmount()=%s, getTenure()=%s, getSourceOfIncome()=%s, getGovtID()=%s, "
					+ "getLoginID()=%s, getLoanID()=%s, getAccountRegisterID()=%s,isSettled()=%s ,getClass()=%s, hashCode()=%s, toString()=%s]",
					amount, tenure, sourceOfIncome, govtID, userID, loanID, 
					getAmount(), getTenure(), getSourceOfIncome(),	getGovtID(), 
					getLoginID(), getLoanID(), getAccountRegisterID(), isSettled(), getClass(), hashCode(), super.toString());
		}	

}