package com.virtusa.billing.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Accountant
{
	@Id
	private int id;
	private String name;
	private String username;
	private String password;
	private String branch;
	private int bcode;
	private double salary;
	
	@OneToMany
	private List<Students> students=new ArrayList<>();
	
	
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Accountant [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", branch=" + branch + ", bcode=" + bcode + ", salary=" + salary + "]";
	}
	
}
