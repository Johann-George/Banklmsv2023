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
@Table(name = "TblRole")
public class Role
{
	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleID;
	private String roleName;
	
	//For One Role Many Users
	//@JsonIgnore					//Avoid Recursive
	//@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)	//One Role Many Users
	//private List<User> users;

	
	//Default Constructor
	public Role()
	{
		super();
	}

	
	//Parameterized Constructor
	public Role(int roleID, String roleName)
	{
		super();
		this.roleID = roleID;
		this.roleName = roleName;
		//this.users = users;
	}

	
	//Getters & Setters
	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}

	
	//Overriding toString()
	@Override
	public String toString() {
		return String.format("Role [roleID=%s, roleName=%s]", roleID, roleName);
	}
	
	
}