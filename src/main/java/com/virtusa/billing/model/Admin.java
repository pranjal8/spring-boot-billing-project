package com.virtusa.billing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin
{
	@Id
	@Column(name = "ROLE_NAME", nullable = false)
	private String roleName;
	private String password;
	public String getRoleName() {
		return roleName;
	}
	@Override
	public String toString() {
		return "Admin [roleName=" + roleName + ", password=" + password + "]";
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
