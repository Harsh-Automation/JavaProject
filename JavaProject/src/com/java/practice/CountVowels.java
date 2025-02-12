package com.java.practice;

public class CountVowels {

	public static void main(String[] args) {
		String sentence = "Java Programming";
		char[] ch = sentence.toLowerCase().replace(" ", "").toCharArray();
		int vowelsCount = 0;
		int consonantCount = 0;

		for (char c : ch) {

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				vowelsCount++;
			} else if (c >= 'a' && c <= 'z') {

				consonantCount++;
			}
		}

		System.out.println("Total number of vowels : " + vowelsCount);
		System.out.println("Total number of consonent : " + consonantCount);

	}

}
