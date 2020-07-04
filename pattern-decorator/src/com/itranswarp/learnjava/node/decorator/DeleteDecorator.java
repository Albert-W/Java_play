package com.itranswarp.learnjava.node.decorator;

import com.itranswarp.learnjava.node.NodeDecorator;
import com.itranswarp.learnjava.node.TextNode;

public class DeleteDecorator extends NodeDecorator {
	public DeleteDecorator(TextNode target) {
		super(target);
	}

	@Override
	public String getText() {
		return "<del>" + target.getText() + "</del>";
	}

}
