package com.itranswarp.learnjava;

import java.util.regex.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Time {

	/**
	 * 从"21:05:19"中提取时，分，秒，否则抛出IllegalArgumentException
	 */
	public static int[] parseTime(String s) {
		// FIXME:
		if (s == null) {
			throw new IllegalArgumentException();	
		}
		
		Pattern p = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");
		Matcher m = p.matcher(s);
		if(m.matches()) {
			int g1 = Integer.parseInt( m.group(1));
			int g2 =  Integer.parseInt( m.group(2));
			int g3 = Integer.parseInt( m.group(3));
			
			if(g1>=24 || g2>=60 || g3>=60) {
				throw new IllegalArgumentException();	
			}
			
//			if(g1 == 24 && (g2>0 || g3>0)) {
//				throw new IllegalArgumentException();
//			}
			
			return new int[] {g1,g2,g3};
		} else {
			throw new IllegalArgumentException();			
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
//		for(int i : parseTime("06:23:60")) {
//			System.out.println(i);
//		}
		
        Pattern p = Pattern.compile("(\\d{3,4})-(\\d{7,8})");
        Matcher m = p.matcher("010-12345678");
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            System.out.println(g1);
            System.out.println(g2);
        } else {
            System.out.println("匹配失败!");
        }
	}
}
