package com.exam.SB_JWT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.SB_JWT.entity.User;
import com.exam.SB_JWT.repository.UserRepository;

@Service
public class UserService {
      @Autowired
      private UserRepository repo;
      
      public User SaveUser(User user) {
    	  return repo.save(user);
      }
      
      public User login(String username,String password) {
    	  User user = repo.findByUsername(username);
    	  
    	  if(user != null && user.getPassword().equals(password)) {
    		  return user;
    	  }
    	  return null;
      }
}
