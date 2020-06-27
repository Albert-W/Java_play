package com.itranswarp.learnjava;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Class cls = p.getClass();
		Field f1 = cls.getDeclaredField("name");
		f1.setAccessible(true);
		f1.set(p, name);
		
		Field f2 = cls.getDeclaredField("age");
		f2.setAccessible(true);
		f2.set(p, age);
		
		
//		Class cls = p.getClass();
//		Method md1 = cls.getMethod("setName",String.class);
//		md1.invoke(p, name);
//		
//		Method md2 = cls.getMethod("setAge",int.class);
//		md2.invoke(p, age);
		

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
