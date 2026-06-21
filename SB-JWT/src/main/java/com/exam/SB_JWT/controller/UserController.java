package com.exam.SB_JWT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.SB_JWT.entity.User;
import com.exam.SB_JWT.service.UserService;
import com.exam.SB_JWT.util.JwtUtil;

@RestController
@RequestMapping("/auth")

public class UserController {
	   @Autowired
       private UserService service;
	   
	    @PostMapping("/register")
	    public User register(@RequestBody User user) {
	        return service.SaveUser(user);
	    }
	    @PostMapping("/login")
	    public String login(@RequestBody User user) {
	    	User validUser = service.login(user.getUsername(), user.getPassword());
	    	
	    	if(validUser != null ) {
	    		String token = JwtUtil.generateToken(validUser.getUsername());
	    		return token;
	    	}
			return "Invalid Username and Password";
	    }

}
