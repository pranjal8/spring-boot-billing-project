package com.billing.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students
{
	@Id
	private int roll;
	private String fullname;
	private String course;
	private String mobile;
	private double fee;
	private int bcode;
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", fullname=" + fullname + ", course=" + course + ", mobile=" + mobile
				+ ", fee=" + fee + ", bcode=" + bcode + "]";
	}
	
}
