package com.java.practice;

public class RemoveDuplicateArrayElement {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 5, 2, 6, 4, 8 };
		int index = 1;
		if (arr.length != 0) {
			for (int i = 1; i < arr.length-1; i++) {

				if (arr[i] != arr[i + 1]) {
					
					arr[index++] = arr[i];

				}
			}
		}
		
		System.out.println(arr.toString());

	}

}
