package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Bike b1 = new Bike();
//        b1.start();
//        b1.stop();
    	
    	
//    	Resource resource = new ClassPathResource("beans.xml");
//    	BeanFactory factory = new XmlBeanFactory(resource);
//    	
    	
//    	@SuppressWarnings("resource")
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	/*Vehicle v1 = (Vehicle) context.getBean("c1");
    	v1.start();
    	v1.stop();
    	
    	Vehicle v2 = (Vehicle) context.getBean("b1");
    	v2.start();
    	v2.stop();
    	
    	Employee e1 = (Employee) context.getBean("emp");
    	System.out.println(e1);
    	
    	
    	Student s1 = (Student) context.getBean("sdt");
    	System.out.println(s1);
    	
    	context.close();*/
    	
    	Demo obj1 = (Demo) context.getBean("d1");
    	obj1.display();
    	
    	Demo obj2 = (Demo) context.getBean("d2");
    	obj2.display();
    	
    	context.close();
    }
}
