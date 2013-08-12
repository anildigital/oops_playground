package com.ee.syntax_highlighter_with_decorator;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class SyntaxHighlighterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHighLightKeywordsWithBlue() throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		
		// Given
		Map<String, List<String>> keywordDecoratorsMap = new HashMap<String, List<String>>();

		List<String> blueDecoration = Arrays
				.asList("com.ee.syntax_highlighter_with_decorator.BlueHighlight");

		keywordDecoratorsMap.put("as", blueDecoration);
		keywordDecoratorsMap.put("if", blueDecoration);
		keywordDecoratorsMap.put("and", blueDecoration);
		keywordDecoratorsMap.put("when", blueDecoration);
		keywordDecoratorsMap.put("then", blueDecoration);

		String inputString = "If we write a program and compile it, then we can run the program to get output";

		// When

		Highlighter highlighter = new Highlighter();
		String actualString = highlighter.highlight(keywordDecoratorsMap,
				inputString);

		// Then
		String expectedString = "[blue]If[blue] we write a program [blue]and[blue] compile it, [blue]then[blue] we can run the program to get output";

		assertEquals(expectedString, actualString);

	}

	@Test
	public void testHighLightKeywordsWithBlueOrRed()
			throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		
		
		// Given
		Map<String, List<String>> keywordDecoratorsMap = new HashMap<String, List<String>>();

		List<String> blueDecoration = Arrays
				.asList("com.ee.syntax_highlighter_with_decorator.BlueHighlight");
		List<String> redDecoration = Arrays
				.asList("com.ee.syntax_highlighter_with_decorator.RedHighlight");
		List<String> greenDecoration = Arrays
				.asList("com.ee.syntax_highlighter_with_decorator.GreenHighlight");

		keywordDecoratorsMap.put("as", blueDecoration);
		keywordDecoratorsMap.put("if", redDecoration);
		keywordDecoratorsMap.put("and", redDecoration);
		keywordDecoratorsMap.put("then", greenDecoration);
		keywordDecoratorsMap.put("when", blueDecoration);

		String inputString = "If we write a program and compile it, then as we run the program, we will get output";
		String expectedString = "[red]If[red] we write a program [red]and[red] compile it, [green]then[green] [blue]as[blue] we run the program, we will get output";

		// When

		Highlighter highlighter = new Highlighter();
		String actualString = highlighter.highlight(keywordDecoratorsMap,
				inputString);

		// Then

		assertEquals(expectedString, actualString);

	}

	@Test
	public void testHighLightKeywordsWithColorandCase()
			throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// Given
		Map<String, List<String>> keywordDecoratorsMap = new HashMap<String, List<String>>();

		keywordDecoratorsMap.put("as", Arrays.asList(
				"com.ee.syntax_highlighter_with_decorator.CapitalizeHighlight",
				"com.ee.syntax_highlighter_with_decorator.BlueHighlight"));

		keywordDecoratorsMap
				.put("if",
						Arrays.asList("com.ee.syntax_highlighter_with_decorator.RedHighlight"));

		keywordDecoratorsMap.put("and", Arrays.asList(
				"com.ee.syntax_highlighter_with_decorator.CapitalizeHighlight",
				"com.ee.syntax_highlighter_with_decorator.RedHighlight"));

		keywordDecoratorsMap
				.put("then",
						Arrays.asList("com.ee.syntax_highlighter_with_decorator.GreenHighlight"));

		keywordDecoratorsMap
				.put("when",
						Arrays.asList("com.ee.syntax_highlighter_with_decorator.BlueHighlight"));

		String inputString = "If we write a program and compile it, then as we run the program, we will get output";
		String expectedString = "[red]If[red] we write a program [red]AND[red] compile it, [green]then[green] [blue]AS[blue] we run the program, we will get output";

		// When

		Highlighter highlighter = new Highlighter();
		String actualString = highlighter.highlight(keywordDecoratorsMap,
				inputString);

		// Then
		assertEquals(expectedString, actualString);
	}

	@Test
	public void testHighLightKeywordsWithColorandCaseandStyle()
			throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// Given
		Map<String, List<String>> keywordDecoratorsMap = new HashMap<String, List<String>>();

		keywordDecoratorsMap.put("as", Arrays.asList(
				"com.ee.syntax_highlighter_with_decorator.CapitalizeHighlight",
				"com.ee.syntax_highlighter_with_decorator.BlueHighlight"));

		keywordDecoratorsMap.put("if", Arrays.asList(
				"com.ee.syntax_highlighter_with_decorator.BoldHighlight",
				"com.ee.syntax_highlighter_with_decorator.RedHighlight"));

		keywordDecoratorsMap.put("and", Arrays.asList(
				"com.ee.syntax_highlighter_with_decorator.CapitalizeHighlight",
				"com.ee.syntax_highlighter_with_decorator.BoldHighlight",
				"com.ee.syntax_highlighter_with_decorator.RedHighlight"));

		keywordDecoratorsMap
				.put("then",
						Arrays.asList("com.ee.syntax_highlighter_with_decorator.GreenHighlight"));

		keywordDecoratorsMap
				.put("when",
						Arrays.asList("com.ee.syntax_highlighter_with_decorator.BlueHighlight"));

		String inputString = "If we write a program and compile it, then as we run the program, we will get output";
		String expectedString = "[red][bold]If[bold][red] we write a program [red][bold]AND[bold][red] compile it, [green]then[green] [blue]AS[blue] we run the program, we will get output";
	
		// When

		Highlighter highlighter = new Highlighter();
		String actualString = highlighter.highlight(keywordDecoratorsMap,
				inputString);

		// Then
		assertEquals(expectedString, actualString);
	}
}
