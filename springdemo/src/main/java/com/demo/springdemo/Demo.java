package com.demo.springdemo;

public class Demo {
	
	public Demo() {
		System.out.println("Demo() constructor");
	}

	public void display() {
		System.out.println("From display method : " + this.hashCode());
		
	}
	
	public void abc() {
		System.out.println("From abc() method");
	}
	
	public void xyz() {
		System.out.println("From xyz() method");
	}
	
	public static Demo another() {
		System.out.println("From another() method");
		return new Demo();
	}
}
