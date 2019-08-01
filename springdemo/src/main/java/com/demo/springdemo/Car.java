package com.demo.springdemo;

public class Car implements Vehicle{
	public void accelerate() {
		System.out.println("Car started....");
	}
	public void brake() {
		System.out.println("Car stoped....");
	}
	public void start() {
		accelerate();
		
	}
	public void stop() {
		brake();
	}
}
