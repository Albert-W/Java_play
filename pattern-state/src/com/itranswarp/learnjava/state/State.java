package com.itranswarp.learnjava.state;

public interface State {

	String init();

	String reply(String input);

}
