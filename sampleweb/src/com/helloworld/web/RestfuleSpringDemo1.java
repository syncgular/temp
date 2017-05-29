package com.helloworld.web;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.util.component.Post;

@RestController
@RequestMapping("/ctrl2")
public class RestfuleSpringDemo1 {

	@GetMapping("/hello1")
	public String sayHello1(HttpServletRequest request, HttpServletResponse response, @RequestParam("name") String name) {
		String str = request.getParameter("name");
		return "hello1 at ctrol2";
	}
	
	
	@GetMapping("/hello2")
	public Post sayHello2() {
		Post post = new Post();
		post.setPost("Hello Post");
		
		return post;
	}
	
	@GetMapping("/hello3")
	public ResponseEntity<Post> sayHello3() {
		Post post = new Post();
		post.setPost("Hello Post");
		
		return new ResponseEntity<Post>(post, HttpStatus.OK);
	}

	@GetMapping("/hello4")
	public ResponseEntity<List<Post>> sayHello4() {
		Post post = new Post();
		post.setPost("Hello Post");
		
		List<Post> postList = Collections.singletonList(post);
		return new ResponseEntity<>(postList, HttpStatus.OK);
	}
	
	
	@PostMapping("/hello5")
	public ResponseEntity<List<Post>> sayHello5(@RequestBody Post post) {
		
		List<Post> postList = Collections.singletonList(post);
		return new ResponseEntity<>(postList, HttpStatus.OK);
	}

}
