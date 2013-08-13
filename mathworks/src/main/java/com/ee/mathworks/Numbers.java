package com.ee.mathworks;

import java.util.List;

public class Numbers {

	public List<Integer> getFilteredNumbers(List<Integer> numbers,
			Filter... filters) {

		for (Filter filter : filters) {
			numbers = filter.filter(numbers);
		}

		return numbers;
	}
}
