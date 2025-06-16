package com.java.practice;

public class ReverseLongestWordInAString {

	public static void main(String[] args) {

		String sentence = " i am all here to tell the space i work at";
		String wordLength = "";

		String[] sentence_array = sentence.split(" ");
		for (String word : sentence_array) {
			if (word.length() > wordLength.length()) {
				wordLength = word;
			}

		}

		System.out.println("Longest word is : " + wordLength);

		String revWord = new StringBuilder(wordLength).reverse().toString();

		String newSen = sentence.trim().replace(wordLength, revWord);
		System.out.println(newSen);

	}

}
