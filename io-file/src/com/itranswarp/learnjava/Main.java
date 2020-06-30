package com.itranswarp.learnjava;

import java.io.File;
import java.io.IOException;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws IOException {
//		System.out.println(File.separator); 
		File currentDir = new File(".");
		String s = " ";
		listDir(currentDir.getCanonicalFile(),s);
		System.out.print("hello");
		System.out.println("world");
	}

	static void listDir(File dir, String s) {
		// TODO: 递归打印所有文件和子文件夹的内容
		File[] fs = dir.listFiles();
		if (fs != null) {
			for (File f : fs) {
				System.out.println(s + f.getName());					
				if(f.isDirectory()) {
					listDir(f, s + " ");
				}
			}
		}
	}
}
