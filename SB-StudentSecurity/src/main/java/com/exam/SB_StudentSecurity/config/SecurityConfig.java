package com.exam.SB_StudentSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
       @Bean
       public InMemoryUserDetailsManager studentDetails() {
		      UserDetails user = User.withDefaultPasswordEncoder().username("student")
		    		                                              .password("123")
		    		                                              .roles("USER")
		    		                                              .build();  
		      return new InMemoryUserDetailsManager(user);
       }
       
}
