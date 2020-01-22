package com.anant.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyBeforeAspect {

	@Pointcut("execution(* com.anant.spring.aop.dao.*.*(..))")
	private void forDaoAdvise() {	}
	
	@Pointcut("execution(* com.anant.spring.aop.dao.*.get*())")
	private void getPointCut() {}
	
	@Pointcut("execution(* com.anant.spring.aop.dao.*.set*(..))")
	private void setPointCut() {}
	
	@Pointcut("forDaoAdvise() && !(getPointCut() || setPointCut())")
	private void excludeGetterandSetter() {}
	
	@Before("excludeGetterandSetter()")
	public void beforeAdvice() {
		System.out.println("Aspect before calling DAO method");
	}
	
	@Before("excludeGetterandSetter()")
	public void beforeAdviceApiCalling() {
		System.out.println("Calling the API");
	}
}
