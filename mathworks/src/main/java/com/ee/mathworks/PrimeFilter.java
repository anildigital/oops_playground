package com.ee.mathworks;

import java.util.ArrayList;
import java.util.List;

public class PrimeFilter extends Filter {

	@Override
	public List<Integer> filter(List<Integer> numbers) {
		List<Integer> filteredNumber = new ArrayList<Integer>();

		for (int number : numbers) {
			if (isPrime(number)) {
				filteredNumber.add(number);
			}
		}

		return filteredNumber;
	}

	private boolean isPrime(int number) {
		if (number == 1 || number == 0) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; // number is divisible so its not prime
			}
		}
		return true; // number is prime now
	}
}
