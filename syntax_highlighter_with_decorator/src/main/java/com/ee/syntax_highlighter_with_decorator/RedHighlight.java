package com.ee.syntax_highlighter_with_decorator;

public class RedHighlight extends Decorator {

	public RedHighlight(String string) {
		super(string);
	}

	@Override
	public String decorate() {
		return "[red]" + this.string + "[red]";
	}

}
