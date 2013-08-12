package com.ee.mathworks;

import java.util.ArrayList;
import java.util.List;

public class RangeFilter extends Filter {

	private int endNumber;
	private int startNumber;

	public RangeFilter(int startNumber, int endNumber) {
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	@Override
	public List<Integer> filter(List<Integer> numbers) {
		List<Integer> returnNumbers = new ArrayList<Integer>();

		for (int number : numbers) {

			if (number >= startNumber && number <= endNumber) {
				returnNumbers.add(number);
			}
		}
		return returnNumbers;
	}

}
