package com.java.practice;

public class ReverseNumber {

	int rem, rev = 0;

	public int reverseNumber(int number) {

		while (number != 0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;

		}

		return rev;

	}

	public static void main(String[] args) {

//		int orginalNum = 284735;
//		int rem, rev = 0;
//
//		System.out.println("Ori");
//
//		while (orginalNum != 0) {
//
//			rem = orginalNum % 10;
//			rev = rev * 10 + rem;
//			orginalNum = orginalNum / 10;
//
//		}
//		System.out.println(rev);
		int org_numb = 83627173;

		System.out.println("Revered number is " + org_numb);

		ReverseNumber rn = new ReverseNumber();
		int reversed_number = rn.reverseNumber(org_numb);

		System.out.println("Revered number is " + reversed_number);

	}
}
