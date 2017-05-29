package com.util.compoTemp;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	
	public static String object2Json() throws Exception{
		Post post = new Post();
		post.setPost("Hello");
		
		String postJson = mapper.writeValueAsString(post);
		System.out.println(postJson);
		
		return postJson;
	}
	
	
	public static Post json2Object() throws Exception{
		
		String postJson = object2Json();
		
		Post post =  (Post)mapper.readValue(postJson, Post.class);
		return post;
	}
	
	
	public static void main(String[] args) throws Exception{
		json2Object();
	}
}
