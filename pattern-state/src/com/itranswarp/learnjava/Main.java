package com.itranswarp.learnjava;

import java.util.Scanner;

import com.itranswarp.learnjava.state.BotContext;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		BotContext bot = new BotContext();
		for (;;) {
			System.out.print("> ");
			String input = scanner.nextLine();
			String output = bot.chat(input);
			System.out.println(output.isEmpty() ? "(no reply)" : "< " + output);
		}
	}
}
