package com.itranswarp.learnjava.service;
import com.itranswarp.learnjava.fastfactory.*;
import com.itranswarp.learnjava.goodfactory.*;

public interface AbstractFactory {

	HtmlDocument createHtml(String md);

	WordDocument createWord(String md);
	
	public static AbstractFactory createFactory(String name) {
		if (name.equalsIgnoreCase("fast")) {
			return new FastFactory();
		} else if (name.equalsIgnoreCase("good")) {
			return new GoodFactory();
		} else {
			throw new IllegalArgumentException("Invalid factory name");
		}
	}
}
