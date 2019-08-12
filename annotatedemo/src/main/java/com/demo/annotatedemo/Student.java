package com.demo.annotatedemo;

public class Student {
	private String name = "Susmitha";

	
	
	public Student() {
		System.out.println("Student object created....");
	}



	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
