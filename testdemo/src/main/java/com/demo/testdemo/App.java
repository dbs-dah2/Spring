package com.demo.testdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator c1 = new Calculator();
        System.out.println("Addition = " + c1.add(10, 20));
        System.out.println("Subtraction = " + c1.sub(20, 10));
        System.out.println("Multiplication = " + c1.multiply(10, 5));
        System.out.println("Division = " + c1.divide(10, 5));
        
    }
}
