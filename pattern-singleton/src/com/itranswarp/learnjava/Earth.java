package com.itranswarp.learnjava;

public class Earth {
	//static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。
	//final 变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值。
	private static Earth instance = new Earth();

	private String name = "earth";

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Earth() {
	}

	public static Earth getInstance() {
		return instance;
	}
}
