package com.ee.syntax_highlighter_with_decorator;

public class CapitalizeHighlight extends Decorator {

	public CapitalizeHighlight(String string) {
		super(string);
	}

	@Override
	public String decorate() {
		return this.string.toUpperCase();
	}

}
