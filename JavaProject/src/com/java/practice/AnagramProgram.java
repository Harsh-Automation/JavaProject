package com.java.practice;


/*
 * input : String str1 = "heart";
 * 		String str2 = "earth"; 
 * 
 * Output : heart and earth Strings are Anagram
 * 
 */
import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String str1 = "heart";
		String str2 = "earth";

		char[] char_element = str1.toCharArray();
		Arrays.sort(char_element);

		// System.out.println(String.valueOf(char_element));

		char[] char_element_2 = str2.toCharArray();
		Arrays.sort(char_element_2);

		if (char_element.length == char_element_2.length) {
			if (Arrays.equals(char_element, char_element_2)) {

				System.out.println(str1 + " and " + str2 + " Strings are Anagram");
			} else {

				System.out.println(str1 + " and " + str2 + " Strings are not an Anagram");

			}
		} else {

			System.out.println("Length of the given string are not equal");
		}
	}

}
