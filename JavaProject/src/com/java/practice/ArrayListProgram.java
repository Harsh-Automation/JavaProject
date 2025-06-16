package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListProgram {

	public static List<List<Integer>> getSubListFromArray(int[] arr) {
		Arrays.sort(arr);

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> countElement = new ArrayList<>();

		for (Integer integer : arr) {

			if (countElement.isEmpty() || countElement.get(0) == integer) {

				countElement.add(integer);

			} else {

				result.add(countElement);
				countElement = new ArrayList<>(Arrays.asList(integer));
			}

		}
		if (!countElement.isEmpty()) {
			result.add(countElement);
		}

		return result;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 1, 3, 3, 5, 6, 6, 8, 5, 5, 5, 8, 8, 7, 3, 3, 2, 2, 1 };
		System.out.println(getSubListFromArray(arr));
	}

}
