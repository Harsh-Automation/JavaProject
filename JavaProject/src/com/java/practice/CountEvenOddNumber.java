package com.java.practice;

import java.util.Scanner;

public class CountEvenOddNumber {

	static int evenOddNum(int num) {

		int even_count = 0, odd_count = 0;
		int rem;
		while (num > 0) {

			rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else
				odd_count++;
			num = num / 10;

		}

		System.out.println("Even number count is " + even_count);
		System.out.println("Odd number count is " + odd_count);

		return 0;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number to count even and odd number : ");

		int number = sc.nextInt();
		evenOddNum(number);

		sc.close();

	}

}
