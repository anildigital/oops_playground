package com.ee.syntax_highlighter_with_decorator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

public class Highlighter {

	public String highlight(Map<String, List<String>> keywordDecoratorsMap,
			String inputString) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		
		String[] tokens = inputString.split(" ");
		String lowerCaseToken = null;
		
		for (String token : tokens) {
			lowerCaseToken = token.toLowerCase();
			if (keywordDecoratorsMap.keySet().contains(lowerCaseToken)) {
				List<String> decorators = keywordDecoratorsMap
						.get(lowerCaseToken);

				String resultToken = token;
				
				for (String decorator : decorators) {
					
					// Get decorator instance
					Class<?> clazz = Class.forName(decorator);
					Constructor<?> constructor = clazz
							.getConstructor(String.class);
					Decorator instance = (Decorator) constructor
							.newInstance(resultToken);
					// decorate
					resultToken = (String) instance.decorate();
				}
				inputString = inputString.replace(token, resultToken);
			}
		}
		return inputString;
	}

}
