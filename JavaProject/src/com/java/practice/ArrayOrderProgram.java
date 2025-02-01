package com.java.practice;

import java.util.Arrays;

public class ArrayOrderProgram {

	public static void main(String[] args) {

		int[] array = { 35, 29, 90, 50, 40, 3, 7 };
		int size = array.length;
		System.out.println("Total array element is : " + size);
		int temp;

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (array[i] >= array[j]) {

					temp = array[j];
					array[j] = array[i];
					array[i] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(array));

	}

}
