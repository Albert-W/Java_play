package com.itranswarp.learnjava.visitor;

import java.io.File;

public interface Visitor {

	void visitDir(File dir);

	void visitFile(File file);
}
