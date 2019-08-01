package com.demo.springdemo;

public class Student {
	private int rollNo;
	private String name;
	private String school;
	private Address address;
	
	
	public Student(int rollNo, String name, String school, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.school = school;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", school=" + school + ", address=" + address + "]";
	}


	
	
}
