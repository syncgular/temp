package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		
		
		HelloWorld ref = (HelloWorld)context.getBean("helloWorld");
		System.out.println(ref);
		
		Company cref = (Company)context.getBean("company");
		
		System.out.println(cref.sayHello());
		
		
		EmployeeDao edao = (EmployeeDao)context.getBean("employeeDao");
		edao.selectAll();
		
		edao.create();
		
	}
}
