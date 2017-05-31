package com.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class HelloAspectAnnotate {
	
	@Pointcut("execution(* com.spring.EmployeeDao.option1(..))")
	private void selectAll(){}
	
	@Before("selectAll()")
	public void before() {
		System.out.println("ASPECT ANNOTATE SELECT ALL");
	}

}
