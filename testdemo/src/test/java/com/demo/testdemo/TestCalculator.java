package com.demo.testdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	Calculator c1 = new Calculator();
	
	
	@Test
	public void abc() {
		System.out.println("abc() test case....");
		assertEquals(30, c1.add(10, 20));
	}
	
	@Test
	public void xyz() {
		System.out.println("xyz() test case....");
		assertEquals(10, c1.sub(20, 10));
	}
	
	@Test
	public void atoz() {
		System.out.println("atoz() test case....");
		assertTrue(true);
		assertTrue(c1.equals(20, 20));
		assertFalse(c1.equals(20,10));
	}
	
	@Before
	public void something() {
		System.out.println("Executed before test case....");
	}
	
	@After
	public void everything() {
		System.out.println("Executed after every test case....");
	}
	
	@BeforeClass
	public static void firstOne() {
		System.out.println("Executed before all the test case....");
	}
	
	@AfterClass
	public static void lastOne() {
		System.out.println("Executed after all the test case....");
	}
}
