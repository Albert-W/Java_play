package com.itranswarp.learnjava;

import java.lang.reflect.Field;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * 
 * @Range注解来检查Java Bean的字段。如果字段类型是String，就检查String的长度，如果字段是int，就检查int的范围。
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println(int.class.getTypeName());
		
		Person p1 = new Person("Bob", "Beijing", 20);
		Person p2 = new Person("", "Shanghai", 20);
		Person p3 = new Person("Alice", "Shanghai", 199);
		for (Person p : new Person[] { p1, p2, p3 }) {
			try {
				check(p);
				System.out.println("Person " + p + " checked ok.");
			} catch (IllegalArgumentException e) {
				System.out.println("Person " + p + " checked failed: " + e);
			}
		}
	}

	static void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
for (Field field : person.getClass().getFields()) {
	Range range = field.getAnnotation(Range.class);
	if (range != null) {
		Object value = field.get(person);
		// TODO:
		// 判断值的类型
		if (value instanceof String) {
			String s = (String) value;
			if(s.length()<= range.min() || s.length()>=range.max()) {
				throw new IllegalArgumentException(field.getName() +  " string length isn't right.");
			}
		}
//				System.out.println(value.getClass().getName());
				if (value.getClass() == Integer.class) {
					int i = (int)value;
					if(i <= range.min() || i >= range.max()) {
						throw new IllegalArgumentException(field.getName() +" isn't right");
					}
				}
				
			}
		}
	}
}
