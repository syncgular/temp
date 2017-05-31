package com.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloRest {
	
	@Autowired
	private HelloDao helloDao;
	
	
	@GetMapping("/hi")
	public Hello sayHello(HttpServletRequest request){
		
		return helloDao.create();
	}
	
	
	@GetMapping("/hii")
	public List<Map<String, Object>> sayHello1(HttpServletRequest request){
		
		return helloDao.selectAll();
	}
	
	
	
}
