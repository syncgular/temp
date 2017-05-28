package com.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private static final ObjectMapper mapper = new ObjectMapper();

	public static Object jsonToObject(String json, String fullyQualifiedClassName) {
		Class<?> jsonClass;
		try {
			jsonClass = Class.forName(fullyQualifiedClassName);
			return mapper.readValue(json, jsonClass);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String objectToJson(Object object) {

		try {
			return mapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String getSampleJson() {
		List<Post> postlist = new ArrayList<>();

		Post post = new Post();
		post.setPost("Hello World");

		postlist.add(post);
		postlist.add(post);

		return JsonUtil.objectToJson(postlist);
	}

	public static void main(String[] args) {

		System.out.println(getSampleJson());
	}
}
