package com.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class HelloAspect {
	public void before() {
		System.out.println("BEFORE");
	}

	public void after() {
		System.out.println("AFTER");
	}
	
	public void around(ProceedingJoinPoint jointPoint) {
		
		
		try {
			System.out.println("AROUND_BEFORE");
			
			jointPoint.proceed();
			
			System.out.println("AROUND_AFTER");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	
	public void beforeAdvOption1(String param1) {
		System.out.println("BEFORE_OPTION1 :: " + param1);
	}
	
	public void beforeAdvOption2(String param1, int param2) {
		System.out.println("BEFORE_OPTION2 :: " + param1 + " :: " + param2);
	}
}
