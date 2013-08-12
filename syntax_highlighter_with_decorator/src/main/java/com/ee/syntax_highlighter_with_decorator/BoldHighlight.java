package com.ee.syntax_highlighter_with_decorator;

public class BoldHighlight extends Decorator {

	public BoldHighlight(String string) {
		super(string);
	}

	@Override
	public String decorate() {
		return "[bold]" + this.string + "[bold]";
	}

}
