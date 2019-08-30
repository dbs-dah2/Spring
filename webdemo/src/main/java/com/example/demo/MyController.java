package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/xyz")
	@ResponseBody
	public String abc() {
		return "<h1>Welcome to first web response</h1><hr><h3>Just for demo</h3>";
	}
	
	@RequestMapping("/greet")
	public String demo() {
		return "welcome.html";
	}
	
	@RequestMapping("/")
	public String login() {
		return "Login";
		//return "welcome.html";
	}
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String loginProcess(@RequestParam("uname") String user,@RequestParam("upwd")String pass) {
		System.out.println("Username : " + user);
		System.out.println("Password : " + pass);
		return "<h1> Welcome " + user + "</h1>";
	}
	
	@RequestMapping("/welcome2")
	public String loginProcess2(@RequestParam("uname") String user,@RequestParam("upwd") String pass) {
		System.out.println("Username : " + user);
		System.out.println("Password : " + pass);
		return "Welcome";
	}
	
	@RequestMapping("/welcome3")
	public String loginProcess3(HttpServletRequest req) {
		String user = req.getParameter("uname");
		String pass = req.getParameter("upwd");
		
		HttpSession session = req.getSession();
		session.setAttribute("username", user);
		
		System.out.println("Username : " + user);
		System.out.println("Password : " + pass);
		return "View/Welcome.jsp";
	}
	
	@RequestMapping("/welcome4")
	public ModelAndView loginProcess4(User user,Address address) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject(address);
		if(user.getUname().equals(user.getUpwd())) {
			mv.addObject(user);
			mv.setViewName("Welcome");
		}
			
		else {
			mv.addObject(address);
			System.out.println(address.getCity());
			mv.setViewName("InvalidLogin");
		}
			
		
		return mv;
	}
	
	@RequestMapping("/welcome5")
	public ModelAndView loginProcess5(User user) {
		
		ModelAndView mv = new ModelAndView();
		
		if(user.getUname().equals(user.getUpwd())) {
			mv.addObject(user);
			mv.setViewName("Welcome");
		}
			
		else {
			//mv.addObject(u);
			mv.setViewName("InvalidLogin");
		}
			
		
		return mv;
	}
}
