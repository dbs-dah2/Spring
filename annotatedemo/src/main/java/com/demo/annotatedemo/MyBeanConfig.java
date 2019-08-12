package com.demo.annotatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("myresources.properties")
@ComponentScan(basePackages = "com.demo.annotatedemo")
public class MyBeanConfig {
	
	@Autowired
	Address address;
	
	//Address address = new Address();
	
	@Bean(name = {"myemp","uremp","emp"})
	public Emp getemp() {
		return new Emp();
	}
	
	@Bean("human")
	@Scope("prototype")
	public Person xyz() {
		Person p1 = new Person();
		p1.setAddress(address);
		return p1;
		//return new Person();
	}
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
}
