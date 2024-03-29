package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Factorial {

	public static long fact(long n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		long r = 1;
		for (long i = 1; i <= n; i++) {
			r = r * i;
		}
		if(r<0) {
			throw new ArithmeticException();
		}
		return r;
	}

}
