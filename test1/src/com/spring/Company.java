package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	private Employee employee;


	public Employee sayHello() {
		return employee;
	}
}
