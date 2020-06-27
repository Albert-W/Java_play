package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String[] fields = { "name", "position", "salary" };
		String table = "employee";
		String insert = buildInsertSql(table, fields);
        String s = "Hi %s, your score is %d!";
        System.out.println(String.format("Alice %d", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));
		System.out.println(insert);
		System.out.println(
				"INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)".equals(insert) ? "测试成功" : "测试失败");
	}

	static String buildInsertSql(String table, String[] fields) {
		// TODO:
//		return "INSERT INTO " + table + " (" + String.join(", ", fields) + ") VALUES (?, ?, ?)";
		String s = "";
		return String.format("INSERT INTO %s (%s) VALUES (%s)", table, String.join(", ", fields), "?, ?, ?");
	}

}
