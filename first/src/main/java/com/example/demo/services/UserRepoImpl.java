package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepo;

@Service
public class UserRepoImpl 
{

	@Autowired
	UserRepo userRepo;
	
	public String saveUser(UserModel userModel)
	{
		userRepo.save(userModel);
		return userModel.getFirstName();
	}
}
