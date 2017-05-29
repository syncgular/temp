package com.helloworld.web;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.util.component.Post;

@Controller
@RequestMapping("/ctrl1")
public class ResfulSpringDemo {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

	@ResponseBody
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello World 11";
	}

	@ResponseBody
	@GetMapping("/hello2")
	public String sayHello1() {
		return "Hello World 22";
	}
	
	
	@PostMapping("/hello5")
	public ResponseEntity<List<Post>> sayHello5(@RequestBody Post post) {
		
		
		List<Post> postList = Collections.singletonList(post);
		return new ResponseEntity<>(postList, HttpStatus.OK);
	}
	
	@GetMapping("/hello6")
	public ResponseEntity<List<Post>> sayHello6() {
		Post post = (Post)context.getBean("post2");
		
		List<Post> postList = Collections.singletonList(post);
		return new ResponseEntity<>(postList, HttpStatus.OK);
	}
	
	
	@GetMapping("/hello7")
	public ResponseEntity<List<Post>> sayHello7(HttpServletRequest request) {
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		Post post = (Post) ctx.getBean("post1");

		
		List<Post> postList = Collections.singletonList(post);
		return new ResponseEntity<>(postList, HttpStatus.OK);
	}
}
