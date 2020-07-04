package com.itranswarp.learnjava;

import java.math.BigDecimal;

import com.itranswarp.learnjava.chain.CEOHandler;
import com.itranswarp.learnjava.chain.DirectorHandler;
import com.itranswarp.learnjava.chain.HandlerChain;
import com.itranswarp.learnjava.chain.ManagerHandler;
import com.itranswarp.learnjava.chain.Request;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		HandlerChain chain = new HandlerChain();
		chain.addHandler(new ManagerHandler());
		chain.addHandler(new DirectorHandler());
		chain.addHandler(new CEOHandler());
		chain.process(new Request("Bob", new BigDecimal("123.45")));
		chain.process(new Request("Alice", new BigDecimal("1234.56")));
		chain.process(new Request("Bill", new BigDecimal("12345.67")));
		chain.process(new Request("John", new BigDecimal("123456.78")));
	}
}
