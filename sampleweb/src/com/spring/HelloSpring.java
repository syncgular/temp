package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.component.Post;


public class HelloSpring {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

	public static void main(String[] args) {
		
		Post post = (Post)context.getBean("post1");
		System.out.println(post);
	}
}
