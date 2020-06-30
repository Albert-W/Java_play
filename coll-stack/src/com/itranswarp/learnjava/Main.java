package com.itranswarp.learnjava;

import java.util.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {
	public static void main(String[] args) {
		String hex = trans2(12500,16);
		System.out.println(hex);
		
		
		String exp = "x + 2 * (y - 5)";
		SuffixExpression se = compile(exp);
		Map<String, Integer> env = Map.of("x", 1, "y", 9);
		int result = se.execute(env);
		System.out.println(env);
		System.out.println(exp + " = " + result + " " + (result == 1 + 2 * (9 - 5) ? "✓" : "✗"));
	}

	static SuffixExpression compile(String exp) {
		// TODO:
		return new SuffixExpression();
	}
	
    static String toHex(int n) {
    	return trans(n,16);
    }
    
    public static String trans(int num, int base) {
    	String result = "";
        char[] chs ={'0','1','2','3',
                '4','5','6','7',
                '8','9','A','B',
                'C','D','E','F'};    	
        Deque<Character> s = new LinkedList<Character>();
        while(num!=0) {
        	s.push(chs[num % base]);
        	num /= base;
        }
        while(!s.isEmpty()) {
        	result += s.pop();
        }
        return result;	
    }  
    
    public static String trans2(int num, int base) {
    	StringBuilder result = new StringBuilder() ;
        char[] chs ={'0','1','2','3',
                '4','5','6','7',
                '8','9','A','B',
                'C','D','E','F'};    	
        while(num!=0) {
        	result.insert(0, chs[num % base]);
        	num /= base;
        }
        return result.toString();	
    }
}

class SuffixExpression {
	int execute(Map<String, Integer> env) {
		// TODO:
		return 0;
	}
}
