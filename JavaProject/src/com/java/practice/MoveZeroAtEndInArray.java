package com.java.practice;

/*
 * input = {4,0,8,9,0,2,4,0}
 * output = {4,8,9,2,4,0,0,0}
 * 
 */
public class MoveZeroAtEndInArray {

	public static void main(String[] args) {

		int arr[] = { 4, 0, 8, 9, 0, 2, 4, 0 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;

//				while (count < arr.length) 
//					arr[count++] = 0;
				

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
