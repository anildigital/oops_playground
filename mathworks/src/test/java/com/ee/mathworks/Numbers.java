package com.ee.mathworks;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

	List<Integer> numbers;
	private List<Filter> filters = new ArrayList<Filter>();

	public Numbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public List<Integer> getFilteredNumbers(Filter...filters) {

		for (Filter filter : filters) {
			this.numbers = filter.filter(numbers);
		}

		return this.numbers;
	}
}
