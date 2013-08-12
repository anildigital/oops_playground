package com.ee.syntax_highlighter_with_decorator;

public class BlueHighlight extends Decorator {

	public BlueHighlight(String string) {
		super(string);
	}

	@Override
	public String decorate() {
		return "[blue]" + this.string + "[blue]";
	}

}
