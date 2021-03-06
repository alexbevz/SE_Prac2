package ru.bevz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TestSolution {


	@ParameterizedTest
	@MethodSource("provideArraysData")
	void TestMaxArea(int[] values, int expected) {
		Solution solution = new Solution();
		Assertions.assertEquals(expected, solution.maxArea(values));
	}

	private static Stream<Arguments> provideArraysData() {
		return Stream.of(
						Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7,}, 49),
						Arguments.of(new int[]{1, 1,}, 1),
						Arguments.of(new int[]{4, 3, 2, 1, 4,}, 16),
						Arguments.of(new int[]{1, 2, 1,}, 2)
		);
	}

	@Test
	public void TestMaxArea() {
		int[] expecteds = new int[]{49, 1, 16, 2,};
		int[][] values = {
						{1, 8, 6, 2, 5, 4, 8, 3, 7,},
						{1, 1,},
						{4, 3, 2, 1, 4,},
						{1, 2, 1,},
		};
		Solution solution = new Solution();
		int[] actuals = new int[expecteds.length];

		for (int i = 0; i < expecteds.length; i++) {
			actuals[i] = solution.maxArea(values[i]);
		}
		Assertions.assertArrayEquals(expecteds, actuals);
	}
}
