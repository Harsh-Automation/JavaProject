package com.java.practice;

public class CountLowerUpperCharacter {

	public static void main(String[] args) {

		String character_string = "Hello Welcome to Java Programming";

		int lower_char = 0;
		int upper_char = 0;

		char[] str_character = character_string.replace(" ", "").toCharArray();

		for (char c : str_character) {

			if (Character.isLowerCase(c)) {

				lower_char++;

			} else {
				upper_char++;
			}
		}

		System.out.println("Lower case character is : "+lower_char);
		System.out.println("Upper case character is : "+upper_char);

		System.out.println("Lower character is : " + lower_char);
		System.out.println("Upper character is : " + upper_char);
	}

}