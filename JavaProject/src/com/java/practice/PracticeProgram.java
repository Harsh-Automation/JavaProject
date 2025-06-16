package com.java.practice;

public class PracticeProgram {

	public static StringBuilder doublecharacters(String str) {

		StringBuilder sb = new StringBuilder();

		String[] sen_array = str.replace(" ", "").toLowerCase().split("");

		for (String each_sen : sen_array) {
			for (int i = 0; i < 2; i++) {

				sb.append(each_sen);

			}

		}

		return sb;

	}

	public static void main(String[] args) {

		String sentence = "Hello Word";

		System.out.println(doublecharacters(sentence));

	}
}
