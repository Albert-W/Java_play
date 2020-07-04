package com.itranswarp.learnjava;

import java.util.List;
import java.util.stream.Stream;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		List<Person> persons = List.of(new Person("小明", 88), new Person("小黑", 62), new Person("小白", 45),
				new Person("小黄", 78), new Person("小红", 99), new Person("小林", 58));
		// 请使用filter过滤出及格的同学，然后打印名字:
		persons.stream()
		.filter(p -> p.score >= 60)
		.forEach(p -> System.out.println(p.name));
		
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, (acc, n) -> acc / n);
        System.out.println(sum); // 45
	}
}

class Person {
	String name;
	int score;

	Person(String name, int score) {
		this.name = name;
		this.score = score;
	}
}