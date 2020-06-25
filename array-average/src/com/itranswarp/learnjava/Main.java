package com.itranswarp.learnjava;

/**
 * 二维数组
 * 计算所有学生的平均分
 */
public class Main {
	public static void main(String[] args) {
		// 用二维数组表示的学生成绩:
		int[][] scores = { //
				{ 82, 90, 91 }, //
				{ 68, 72, 64 }, //
				{ 95, 91, 89 }, //
				{ 67, 52, 60 }, //
				{ 79, 81, 85 }, //
		};
		// TODO:
		double average = 0;
		double sum = 0 ;
		for (int i =0;i<scores.length;i++) {
			for (int j:scores[i]) {
				sum += j;
			}
		}
		average = sum/ (scores.length * scores[0].length); 
		
		System.out.println(average);
		if (Math.abs(average - 77.733333) < 0.000001) {
			System.out.println("测试成功");
		} else {
			System.out.println("测试失败");
		}
	}
}
