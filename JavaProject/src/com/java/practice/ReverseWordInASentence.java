package com.java.practice;

public class ReverseWordInASentence {

	public static void main(String[] args) {

		String sentence = "I Love Java Programming";

		String target = "Love Java";

		if (sentence.contains(target)) {

			StringBuilder sb = new StringBuilder(target).reverse();

			String reverse_word = sentence.replace(target, sb.toString());

			System.out.println(reverse_word);
		} 
		else
		System.out.println(target + " not present in the given sentence");
	}

}
