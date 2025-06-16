package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class FindNuminArray {

	public static void main(String args[]) {

		int[] arr = { 7, 1, 3, 4, 5, 3, 2, 4 };

		int dup_count = 0;
		Integer second_dup = null;

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				dup_count++;
				if (dup_count == 2) {
					second_dup = arr[i];
					break;
				}
			} else {
				set.add(arr[i]);
			}
		}

		if (second_dup != null) {
			System.out.println("Duplicate number using HashSet : " + second_dup);

		}

		int[] num_arr = { 10, 20, 50, 40, 40, 10 };
		int count = 0;
		int second =0;

		for (int i = 0; i < num_arr.length; i++) {

			for (int j = i + 1; j < num_arr.length; j++) {

				if (num_arr[i] == num_arr[j]) {
					count++;
					if (count == 2) {
						
						//System.out.println(num_arr[i]);
						second = num_arr[i];

						break;
					}
					break;

				}
				
			}
			

		}
		System.out.println("Second duplicate no is : " + second);

	}

}
