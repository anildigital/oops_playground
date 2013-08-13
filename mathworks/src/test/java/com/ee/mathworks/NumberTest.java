package com.ee.mathworks;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class NumberTest {

	@Test
	public void testItShouldReturnPrimeNumbers() {

		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15);

		Filter primeFilter = new PrimeFilter();
		Numbers primeNumbers = new Numbers();

		List<Integer> expectedNumbers = Arrays.asList(2, 3, 5, 7, 11, 13);

		// When
		List<Integer> filteredNumbers = primeNumbers.getFilteredNumbers(
				numbers, primeFilter);

		// Then
		Assert.assertEquals(expectedNumbers, filteredNumbers);

	}

	@Test
	public void testItShouldReturnOddsNumbers() {

		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15);

		Filter oddFilter = new OddFilter();
		Numbers oddNumbers = new Numbers();

		List<Integer> expectedNumbers = Arrays
				.asList(1, 3, 5, 7, 9, 11, 13, 15);

		// When
		List<Integer> filteredNumbers = oddNumbers.getFilteredNumbers(numbers,
				oddFilter);

		// Then
		Assert.assertEquals(expectedNumbers, filteredNumbers);

	}

	@Test
	public void testItShouldReturnOddPrimeNumbers() {

		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15);

		Filter primeFilter = new PrimeFilter();

		Filter oddFilter = new OddFilter();

		List<Integer> expectedNumbers = Arrays.asList(3, 5, 7, 11, 13);

		Numbers resultNumbers = new Numbers();

		List<Integer> filteredNumbers = resultNumbers.getFilteredNumbers(
				numbers, primeFilter, oddFilter);

		// Then
		Assert.assertEquals(expectedNumbers, filteredNumbers);

	}

	@Test
	public void testifItReturnRangedFilteredNumber() {

		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15);

		int startNumber = 5;
		int endNumber = 10;

		Filter rangefilter = new RangeFilter(startNumber, endNumber);
		Numbers resultNumbers = new Numbers();

		List<Integer> expectedNumbers = Arrays.asList(5, 6, 7, 8, 9, 10);

		List<Integer> filteredNumbers = resultNumbers.getFilteredNumbers(
				numbers, rangefilter);

		// Then
		Assert.assertEquals(expectedNumbers, filteredNumbers);

	}

	@Test
	public void testifItReturnOddPrimeRangedFilteredNumber() {

		// Given
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32, 33, 34, 35);

		int startNumber = 2;
		int endNumber = 31;

		Filter rangefilter = new RangeFilter(startNumber, endNumber);
		Filter oddFilter = new OddFilter();
		Filter primeFilter = new PrimeFilter();

		Numbers resultNumbers = new Numbers();

		List<Integer> expectedNumbers = Arrays.asList(3, 5, 7, 11, 13, 17, 19,
				23, 29, 31);

		// When
		List<Integer> filteredNumbers = resultNumbers.getFilteredNumbers(
				numbers, rangefilter, oddFilter, primeFilter);

		// Then
		Assert.assertEquals(expectedNumbers, filteredNumbers);

	}

}