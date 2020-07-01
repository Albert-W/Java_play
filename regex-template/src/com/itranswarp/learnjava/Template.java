package com.itranswarp.learnjava;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Template {

	final String template;
	final Pattern pattern = Pattern.compile("\\$\\{(\\w+)\\}");

	public Template(String template) {
		this.template = template;
	}

	public String render(Map<String, Object> data) {
		Matcher m = pattern.matcher(template);
		// TODO:
		String s=template;
		while (m.find()) {
			//String sub = template.substring(m.start(), m.end());//${name}
			//System.out.println(m.group(1));//name
			s = s.replace(m.group(), data.get(m.group(1)).toString());
		}
		return s;
	}

}