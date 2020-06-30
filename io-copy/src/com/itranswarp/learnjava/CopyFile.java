package com.itranswarp.learnjava;

import java.io.*;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class CopyFile {

	public static void main(String[] args) throws IOException {
		File f = new File(".");
		System.out.println(f.getCanonicalPath());
		System.out.println(f.list());
		for(String x: f.list()) {
			System.out.println(x);
		}
//		if (args.length != 2) {
//			System.err.println("Usage:\n  java CopyFile.java <source> <target>");
//			System.exit(1);
//		}
//		copy(args[0], args[1]);
		copy("1.txt","2.txt");
	}

	static void copy(String source, String target) throws IOException {
		// 友情提示：测试时请使用无关紧要的文件
		// TODO:
		try (InputStream input = new FileInputStream(source);
				OutputStream output = new FileOutputStream(target)){
			input.transferTo(output);
		}
		
	}
}
