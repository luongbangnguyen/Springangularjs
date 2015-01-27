package com.java.spring.angular.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestPages {
	
	@RequestMapping(value="/")
	public String homeDefault(){
		return "home";
	}
	
	@RequestMapping(value="home")
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="login")
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping(value="profile")
	public String profilePage(){
		return "profile";
	}
	
}
