package com.java.practice;

public class ReverseCharacter {

	public static void main(String[] args) {

		String originalSentence = "165Tom#7Deal99year";

		char[] chars = originalSentence.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		System.out.println("New Line");

		for (char c : chars) {
			if (Character.isAlphabetic(c)) {
				sb.append(c);

			} else {
				System.out.print(sb.reverse());
				if (!(sb.length() <= 0)) {
					sb.setLength(0);
				}
				System.out.print(c);

			}

		}
		System.out.print(sb.reverse());
		if (!(sb.length() <= 0)) {
			sb.setLength(0);
		}

	}

}
