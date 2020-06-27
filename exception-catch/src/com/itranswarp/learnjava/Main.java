package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 * try catch 捕获异常
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		// TODO: 捕获异常并处理
		int c = stringToInt(a);
		int d = stringToInt(b);
		System.out.println(c * d);
	}

	static int stringToInt(String s) {
		int r=0;
		try {
			r =  Integer.parseInt(s);
		} catch(Exception e){
			e.printStackTrace();
		}
		return r;
	}
}
