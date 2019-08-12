package com.demo.annotatedemo;


public class Address {
	private String state = "Telangana";
	private String city = "Hyderabad";
	private int pin = 123456;
	
	
	public Address() {
		System.out.println("Address object created....");
	}
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
