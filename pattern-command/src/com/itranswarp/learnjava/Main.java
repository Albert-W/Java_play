package com.itranswarp.learnjava;

import com.itranswarp.learnjava.command.Command;
import com.itranswarp.learnjava.command.CopyCommand;
import com.itranswarp.learnjava.command.PasteCommand;
import com.itranswarp.learnjava.command.TextEditor;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.add("Command pattern in text editor.\n");
		Command copy = new CopyCommand(editor);
		copy.execute();
		editor.add("----\n");
		Command paste = new PasteCommand(editor);
		paste.execute();
		System.out.println(editor.getState());
	}
}
