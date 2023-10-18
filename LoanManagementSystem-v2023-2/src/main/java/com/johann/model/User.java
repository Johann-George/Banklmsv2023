package com.johann.model;

import java.sql.Date;
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
@Table(name = "TblUser")
public class User
{
	//Declare Variable
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	
	@Column(nullable = false)
	private String userName;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String phoneNo;
	
	@Column(nullable = false)
	private String password;
	
	private Date dateOfBirth;
	private boolean isActive;
	
	private int dependent;	 		// Number of dependent
	private String aadharNumber; 	// identification
	
	//@JoinColumn				//User.loginId = Login.loginId
	@JoinColumn(name = "roleId")
	@ManyToOne
	private Role role;
	
	//Default Constructor
	public User()
	{
		super();
	}
	
	//Parameterized Constructor
	public User(int userID, String name, String email, String phoneNo, String password, Date dateOfBirth,
			boolean isActive, Role role)
	{
		super();
		this.userID = userID;
		this.userName = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.isActive = isActive;
		this.role = role;

	}
	
	public User(int userID, String userName, String email, String phoneNo, String password, Date dateOfBirth,
			boolean isActive, int dependent, String aadharNumber, Role role) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.isActive = isActive;
		this.dependent = dependent;
		this.aadharNumber = aadharNumber;
		this.role = role;
		
	}

	//Getters & Setters
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo(){
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getDependent() {
		return dependent;
	}

	public void setDependent(int dependent) {
		this.dependent = dependent;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", isActive=" + isActive + ", dependent="
				+ dependent + ", aadharNumber=" + aadharNumber + ", role=" + role + "]";
	}
}