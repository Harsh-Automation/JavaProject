package com.java.practice;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String str1 = "heart";
		String str2 = "earth";
		
		char[] char_element = str1.toCharArray();
		Arrays.sort(char_element);
		
		//System.out.println(String.valueOf(char_element));

		char[] char_element_2 = str2.toCharArray();
		Arrays.sort(char_element_2);

		if (Arrays.equals(char_element, char_element_2)) {

			System.out.println(str1 + " and " + str2 + " Strings are Anagram");
		} else {

			System.out.println(str1 + " and " + str2 + " Strings are not an Anagram");

		}

	}

}
