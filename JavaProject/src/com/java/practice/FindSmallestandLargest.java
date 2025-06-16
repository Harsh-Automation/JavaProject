package com.java.practice;

import java.util.Arrays;

//Find second smallest and second largest element in an array

public class FindSmallestandLargest {

	public static void main(String[] args) {

		int[] arr = { 35, 70, 30, 22, 70, 80 };
		int second_small = 0;
		int second_large = 0;

		if (arr.length >= 2) {

			Arrays.sort(arr);

			second_small = arr[1];
			second_large = arr[arr.length - 2];

		}
		System.out.println("Given array element is " + Arrays.toString(arr));
		System.out.println("Second smallest no. is " + second_small);
		System.out.println("Second smallest no. is " + second_large);

	}

}
