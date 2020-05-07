package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepo;
import com.example.demo.services.UserRepoImpl;

@RestController
public class LoginController 
{
	@Autowired
	UserRepoImpl userRepoImpl;
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/")	
	public ModelAndView home()
	{
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	@GetMapping("/home")	
	public String samp()
	{
		return "index";
	}
	
	@GetMapping("login")
	public String login(String userName,String password)
	{
		return userName;
	}
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserModel userModel)
	{
		
		System.out.println(userModel.getFirstName());
		return userRepoImpl.saveUser(userModel);
	}
	
}
