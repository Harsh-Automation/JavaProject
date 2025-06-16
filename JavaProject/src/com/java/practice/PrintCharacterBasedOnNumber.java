package com.java.practice;

public class PrintCharacterBasedOnNumber {

	public static void main(String[] args) {
		String str = "a2b3c1d3j2";

		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));

			} else {
				int index = Character.getNumericValue(str.charAt(i));

				for (int j = 1; j < index; j++) {
					System.out.print(str.charAt(i - 1));
				}

			}
		}

	}

}
