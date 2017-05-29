package com.helloworld.web;

import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.util.component.Post;

@Controller
@RequestMapping("/ctrl1")
public class ResfulSpringDemo {

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
}
