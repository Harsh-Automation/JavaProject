package com.java.practice;

import java.util.Arrays;

public class ReplaceDuplicateCharacter {

	public static void main(String[] args) {
		String input = "Automation";

		StringBuilder sb = new StringBuilder();
		char[] char_arr = input.toCharArray();

		System.out.println(Arrays.toString(char_arr));

		for (char ch : char_arr) {
//			System.out.println(ch + " " + input.indexOf(ch));
//			System.out.println(input.lastIndexOf(ch));

			if (input.toLowerCase().indexOf(ch) != input.lastIndexOf(ch))

			{
				sb.append(2);

			} else
				sb.append(ch);

		}
		System.out.println(sb.toString());

	}

}
