package com.exam.SB_StudentSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
       @GetMapping("/student")
       public String stdDashboard() {
   		return "Welcome to Student Dashboard";
   	}
}
