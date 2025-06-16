package com.java.practice;

import java.util.Random;

public class ALphaNumericString {

	public static void main(String[] args) {

		String alph_num = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] str = alph_num.toCharArray();
		Random random = new Random();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 6; i++) {

			int index = random.nextInt(str.length);
			sb.append(str[index]);

		}

		System.out.println("ALphaNumericString is " + sb.toString());

	}

}
