package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	CustomersDAO dao;
	
	@RequestMapping("/")
	public String index() {
		return "Index.jsp";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "Register.jsp";
	}
	
	@RequestMapping("/confirm")
	public ModelAndView insertData(Customers customer) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("customer",customer);
		dao.save(customer);
		mv.setViewName("Confirm.jsp");
		return mv;
	}
	
	@RequestMapping("/validate")
	public ModelAndView validate(Customers customer) {
		
		ModelAndView mv = new ModelAndView();
		
		if(!(dao.findById(customer.getEmail()).isPresent()))
			mv.setViewName("Register.jsp");
		else {
			insertData(customer);
		}
		
		return mv;
	}
	
}
