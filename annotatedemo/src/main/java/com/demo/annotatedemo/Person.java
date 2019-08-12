package com.demo.annotatedemo;


public class Person {
	
	private String name;
	private int age;
	private Address address;
	
	
	

	public Person() {
		System.out.println("Person object created....");
	}
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
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


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	
}
