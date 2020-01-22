package com.anant.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyBeforeAspect {

	@Before("execution(* com.anant.spring.aop.dao.*.*(..))")
	public void beforeAdvice() {
		System.out.println("Aspect before calling DAO method");
	}
}
