package com.itranswarp.learnjava;

import java.io.File;
import java.io.IOException;

import com.itranswarp.learnjava.visitor.ClassFileCleanerVisitor;
import com.itranswarp.learnjava.visitor.FileStructure;
import com.itranswarp.learnjava.visitor.JavaFileVisitor;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws IOException {
		FileStructure fs = new FileStructure(new File("."));
		fs.handle(new JavaFileVisitor());
//		fs.handle(new ClassFileCleanerVisitor());
	}
}
