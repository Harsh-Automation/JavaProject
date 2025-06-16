/*
 * Pattern program to print below pattern
 * 1234*
 * 123*5
 * 12*45
 * 1*345
 * *2345
 */

package com.java.practice;

public class PrintPattern {

	public static void main(String[] args) {
		
		int n =4;

		for (int i = n; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}
			if (i >= 0) {
				System.out.print("*");
			}

			for (int k = i + 2; k <= n+1; k++) {

				System.out.print(k);

			}

			System.out.println();
		}

	}

}
