package com.ee.mathworks;

import java.util.ArrayList;
import java.util.List;

public class OddFilter extends Filter {

	public List<Integer> filter(List<Integer> numbers) {

		List<Integer> filteredNumber = new ArrayList<Integer>();

		for (int number : numbers) {
			if (isOddNumber(number)) {
				filteredNumber.add(number);
			}
		}
		return filteredNumber;
	}

	private boolean isOddNumber(int number) {

		if (number % 2 == 0) {
			return false;
		}
		return true;
	}
}
