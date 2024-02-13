package com.example.demo.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	
	  public UserServiceImpl (UserRepo userRepo) { 
		  super();
		  this.userRepo = userRepo; 
	  }
	 
	
	@Override
	public User saveUser(User user) {
		
		return userRepo.save(user);
	}

}
