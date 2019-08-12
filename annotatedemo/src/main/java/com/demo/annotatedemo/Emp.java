package com.demo.annotatedemo;

import org.springframework.beans.factory.annotation.Value;

public class Emp {
	
	@Value("${myCompany}")
	private String comapny;
	@Value("${myName}")
	private String name;
	@Value("${myAge}")
	private int age;
	
	
	
	public Emp() {
		System.out.println("Emp object created....");
	}



	@Override
	public String toString() {
		return "Emp [comapny=" + comapny + ", name=" + name + ", age=" + age + "]";
	}


	
}
