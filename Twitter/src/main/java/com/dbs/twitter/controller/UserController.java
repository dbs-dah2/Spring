package com.dbs.twitter.controller;

import java.io.IOException;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbs.twitter.model.Tweets;
import com.dbs.twitter.model.User;
import com.dbs.twitter.service.UserService;



@Controller
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/login")
    public String login(Model model){
        return "login";
    }
	
	@PostMapping("/login")
    public String loginUser(
            @RequestParam("username")String username,
            @RequestParam("password") String password,
            Model model){
        System.out.println("Username is "+username + " password is "+ password);
        if(username.equalsIgnoreCase(password)){
            model.addAttribute("user", username);
            return "success";
        }
        return "login";
    }
	
	@GetMapping("/register")
    public String showRegistrationForm(Model model){
        return "register";
    }

    @PostMapping("/register")
    public String registerUser( @Valid @ModelAttribute("user") User user,
                                BindingResult bindingResult) throws IOException {
        if(bindingResult.hasErrors()){
            System.out.println("Error "+bindingResult.toString());
            return "register";
            
        }
        this.userService.saveUser(user);
        return "HomePage";
    }
    
    @GetMapping("/addTweet")
    public String addTweetForm(Model model){
        return "addTweet";
    }
    
//    @PostMapping("/addTweet")
//    public String addTweet(@ModelAttribute("tweet") Tweets tweet,User user){
//    	System.out.println("tweet id : " + tweet.getId());
//    	this.userService.saveTweet(tweet);
//    	user.addUserTweets(tweet);
//    	return "HomePage";
//    }
    
    @PostMapping("/addTweet")
    public String addTweet(@ModelAttribute("tweet") Tweets tweet,Model model){
    	//this.addUserTweets(tweet);
    	this.userService.saveTweet(tweet);
    	return "HomePage";
    }
    
    
//    @PostMapping("/addTweet")
//    public String loginUserTweet(
//            @RequestParam("tweet")String tweet,
//            Model model){
//        System.out.println("Tweet is "+tweet );
//        
//        return "HomePage";
//    }
}
