package com.itranswarp.sample;

import com.itranswarp.world.Person;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * oop-package
 *└── src
 *    └── com
 *        └── itranswarp
 *            ├── sample
 *            │   └── Main.java
 *            └── world
 *                └── Person.java
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("小明");
		System.out.println(p1.hello());
	}

}
