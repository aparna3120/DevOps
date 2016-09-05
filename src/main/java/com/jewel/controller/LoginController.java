package com.jewel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jewel.model.UserLogin;
import com.jewel.model.UserRegister;

@Controller
public class LoginController {

	

	//mvc mapping of register page	
	/*@RequestMapping("/register")
	public String showRegister()
	{
		//System.out.println("register");
	return "register";
	}*/
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public ModelAndView submitRegisterForm(@ModelAttribute("userregister") UserRegister userregister)
	{
		System.out.println("welcome");
		ModelAndView model=new ModelAndView("register");
		return model;
	}
	
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		//System.out.println("About Us");
		return "about_us";
	}
	
	/*@RequestMapping("/login")
	public String showLogin()
	{
		//System.out.println("login");
		return "login";
	}*/
	
	//Mapping of login spring mvc login form with mode class
	@RequestMapping(value="login", method=RequestMethod.GET)
	public ModelAndView submitLoginForm(@ModelAttribute("userlogin") UserLogin userlogin)
	{
		//System.out.println("welcome");
		ModelAndView model=new ModelAndView("login");
			return model;
	}
	 
}
