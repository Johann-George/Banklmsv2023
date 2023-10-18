package com.johann.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TblLogin")
public class Login {

	//Declare Variable
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int loginId;
		
		@Column(nullable = false)
		private String loginName;
		
		@Column(nullable = false)
		private String password;
		
		//@JoinColumn				//User.roleId = Role.roleId
		@JoinColumn(name = "roleID")
		@ManyToOne
		private Role role;

		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Login(int loginId, String loginName, String password, Role role) {
			super();
			this.loginId = loginId;
			this.loginName = loginName;
			this.password = password;
			this.role = role;
		}

		public int getLoginId() {
			return loginId;
		}

		public void setLoginId(int loginId) {
			this.loginId = loginId;
		}

		public String getLoginName() {
			return loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		
		@Override
		public String toString() {
			return "Login [loginId=" + loginId + ", loginName=" + loginName + ", password=" + password + ", role="
					+ role + "]";
		}

}