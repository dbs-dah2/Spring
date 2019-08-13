package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Person {
	@Value("Susmitha")
	private String name;
	@Value("21")
	private int age;
	@Autowired
	private Address myAddress;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getMyAddress() {
		return myAddress;
	}
	public void setMyAddress(Address address) {
		this.myAddress = address;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + myAddress + "]";
	}


	
}
