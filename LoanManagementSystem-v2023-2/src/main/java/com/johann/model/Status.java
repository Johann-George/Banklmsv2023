package com.johann.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblStatus")
public class Status
{
	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	private String statusHeader;
	
	//For One Role Many Users
	//@JsonIgnore					//Avoid Recursive
	//@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)	//One Role Many Users
	//private List<User> users;

	
	//Default Constructor
	public Status()
	{
		super();
	}

	
	//Parameterized Constructor
	public Status(int statusId, String statusHeader)
	{
		super();
		this.statusId = statusId;
		this.statusHeader = statusHeader;
	}

	
	//Getters & Setters
	public int getStatusID() {
		return statusId;
	}

	public void setRoleID(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusHeader() {
		return statusHeader;
	}

	public void setStatusHeader(String statusHeader) {
		this.statusHeader = statusHeader;
	}


	
	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusHeader=" + statusHeader + "]";
	}


}