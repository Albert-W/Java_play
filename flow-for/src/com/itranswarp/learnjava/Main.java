package com.itranswarp.learnjava;

/**
 * for练习
 * 计算圆周率
 * pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 ...)
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
		for (int i = 1; i < 100000; i += 2) {
			// TODO:
			pi += 4*( 1.0/(2*i -1) - 1.0/(2*i+1));
		}
		System.out.println(pi);
	}

}
