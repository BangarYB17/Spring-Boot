package com.model.SB_AopDemo2.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
       public String getUserInfo() {
    	   System.out.println("Inside user info method");
		   return "User Details";	   
       }
       
}
