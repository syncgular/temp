package com.helloworld.web;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	
}
