package com.java.practice;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String sentence = "Big band bug bit a big black dog on his band black nose";

		String[] words = sentence.toLowerCase().split(" ");

		int count;

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0") {
				System.out.println("Duplicate words is : " + words[i]);

			}
		}

	}
}
