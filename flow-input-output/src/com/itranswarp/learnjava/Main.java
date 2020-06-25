package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
 */
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int prev = s.nextInt();
		int score = s.nextInt();
//		会被转换成int 然后变成0,
		double percent =100.0 * (score - prev)/prev ;
		System.out.println(percent);
		System.out.printf("成绩提高了? %.2f%%",percent);
		s.close();
	}

}
