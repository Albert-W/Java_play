package com.itranswarp.learnjava.node;

import java.util.List;

public interface Node {

	Node add(Node node);

	List<Node> children();

	String toXml();
}
