package com.java.practice;

import java.util.Arrays;

public class ArrayTraverseByNumber {

	public static void main(String[] args) {

		int num_arr[] = { 15, 3, 6, 20, 45, 22 };
		int length = num_arr.length;

		for (int i = 0; i < 2; i++) {
			int temp = num_arr[length - 1];
			for (int j = length - 1; j >= 1; j--) {

				num_arr[j] = num_arr[j - 1];
			}
			num_arr[0] = temp;
			System.out.println(Arrays.toString(num_arr));

		}
		
		int num_arr2[] = { 15, 3, 6, 20, 45, 22 };
		int length2 = num_arr2.length;

		for (int i = 0; i < 2; i++) {
			int temp = num_arr2[0];
			for (int j = 1; j < length2; j++) {

				num_arr2[j - 1] = num_arr2[j];
			}
			num_arr2[length2 - 1] = temp;
			System.out.println(Arrays.toString(num_arr2));

		}
	}

}
