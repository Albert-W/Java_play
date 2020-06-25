package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) Math.random() * 3;
		System.out.println(random);
		switch (choice - random) {
		// TODO:
		case -1 :
		case 2 :
			System.out.println("Congrats, you win");
			break;
		case 0 :
			System.out.println("It's a even!");
			break;
		default:
			System.out.println("sorry, bro, you fail.");
				
			
		}
	}

}
