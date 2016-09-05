package com.jewel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	
	@RequestMapping("/login")
	public String showLogin()
	{
		//System.out.println("login");
		return "login";
	}
	
	@RequestMapping("/customer")
	public String showRegister()
	{
		//System.out.println("register");
		return "register";
	}
	
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		//System.out.println("About Us");
		return "about_us";
	}
	
	
}
