package com.ee.syntax_highlighter_with_decorator;

public abstract class Decorator {

	protected String string;

	public Decorator(String string) {
		this.string = string;
	}
	
	public abstract String decorate();

}
