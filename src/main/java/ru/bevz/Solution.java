package ru.bevz;

public class Solution {

	public int maxArea(int[] height) {
		int max = 0;
		int beginIndex = 0;
		int endIndex = height.length - 1;
		while (beginIndex < endIndex) {
			max = Math.max(max, (endIndex - beginIndex) * Math.min(height[beginIndex], height[endIndex]));
			if (height[beginIndex] > height[endIndex]) {
				endIndex--;
			} else {
				beginIndex++;
			}
		}
		return max;
	}
}
