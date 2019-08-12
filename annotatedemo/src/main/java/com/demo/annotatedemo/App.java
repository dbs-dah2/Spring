package com.demo.annotatedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
    	
    	Emp e1 = (Emp) context.getBean("myemp");
    	System.out.println(e1);

    	Emp e2 = (Emp) context.getBean("uremp");
    	System.out.println(e2);

    	Emp e3 = (Emp) context.getBean("emp");
    	System.out.println(e3);
    	
    	Person p1 = (Person) context.getBean("human");
    	System.out.println(p1);
    	
    	Person p2 = (Person) context.getBean("human");
    	System.out.println(p2);
    	
    }
}
