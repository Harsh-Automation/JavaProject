package com.java.practice;

import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 5, 2, 6, 4, 8, 2, 8, 2, 8 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element is " + arr[i]);
					break;
				}

			}

		}

		int arr1[] = { 2, 6, 5, 2, 6, 4, 8, 2, 8, 2, 8 };

		int new_arr[] = Arrays.stream(arr1).distinct().toArray();

		System.out.println(Arrays.toString(new_arr));

		int array[] = { 2, 6, 5, 2, 6, 4, 10 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				int sum = array[i] + array[j];

				if (sum == 10) {
					System.out.println("Indices for sum 10 is " + i + " " + j);
					break;

				}
			}

		}

	}
}
