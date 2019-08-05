package com.example.demo;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Customers {
	
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String email;
	private String fname;
	private String lname;
	private int mobile;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
