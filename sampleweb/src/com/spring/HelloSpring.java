package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.Post;

public class HelloSpring {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		
		Post post = (Post)context.getBean("post5");
		System.out.println(post);
	}
}
