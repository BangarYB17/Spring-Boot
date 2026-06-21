package com.model.SB_AopDemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.SB_AopDemo2.service.UserService;

@RestController
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
		
	}
	@GetMapping("/userinfo")
	public String getUser(){
		return userService.getUserInfo();
		
	}
}
