package com.java.practice;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String sentence = "Big box ";
		int count = 0;
		sentence = sentence.toLowerCase();

		System.out.println(sentence);

		String[] words = sentence.split(" ");
		if (words.length > 2) {

			for (int i = 0; i < words.length; i++) {
				count = 1;
				for (int j = i + 1; j < words.length; j++) {

					if (words[i].equals(words[j])) {
						count++;
						words[j] = "0";

					}

				}
				if (count > 1 && words[i] != "0") {
					System.out.println(words[i]);

				}

			}

		} else
			System.out.println("Length of the sentence should be more than 2 words.");

	}

}
