package com.model.SB_AopDemo2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
	
	@Before("execution(* com.model.SB_AopDemo2.service.*.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Before execution method");
	}
	
	@After("execution(* com.model.SB_AopDemo2.service.*.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("After execution method");
	}

}
