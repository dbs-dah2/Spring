package com.example.demo;

public class Address {
	private String city = "Hyderabad";

	@Override
	public String toString() {
		return "Address [city=" + getCity() + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
}
