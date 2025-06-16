package com.java.practice;


public class ArrayTraverse {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 30, 70, 90, 20 };
		int index = arr.length;
		int temp;

		for (int i = 0; i < 2; i++) {

			temp = arr[0];

			for (int j = 1; j < index; j++) {

				arr[j - 1] = arr[j];
			}
			arr[index - 1] = temp;

		}
		for (int num : arr)
		{

			System.out.print(num + " ");
		}
		int[] arr2 = { 10, 50, 30, 70, 90, 20 };

		int ind = arr2.length;
		int tm;
		for (int k = 0; k < 2; k++) {
			tm = arr2[ind - 1];
			for (int n = ind - 2; n >= 0; n--) {
				arr2[n + 1] = arr2[n];
			}

			arr2[0] = tm;
		}
		System.out.println();
		for (int num : arr2)
		{

			System.out.print(num + " ");
		}
	}

}
