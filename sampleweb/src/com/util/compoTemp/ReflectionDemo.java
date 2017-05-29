package com.util.compoTemp;

import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception{
		Class<?> refClass = Class.forName(Post.class.getName());
		
		Object newInstance = refClass.newInstance();

		System.out.println(newInstance);
		
		
		Method postMethod1 = refClass.getDeclaredMethod("setLike_count", int.class);
		postMethod1.invoke(newInstance, 100);
		
		
		Method postMethod = refClass.getDeclaredMethod("getLike_count");
		Object routput = postMethod.invoke(newInstance);
		System.out.println(routput);
	}
}
