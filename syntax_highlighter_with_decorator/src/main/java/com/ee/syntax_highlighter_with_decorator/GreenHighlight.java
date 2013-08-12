package com.ee.syntax_highlighter_with_decorator;

public class GreenHighlight extends Decorator {

	public GreenHighlight(String string) {
		super(string);
	}

	@Override
	public String decorate() {
		return "[green]" + this.string + "[green]";
	}

}
