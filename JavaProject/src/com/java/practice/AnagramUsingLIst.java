package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramUsingLIst {

	public static void main(String[] args) {
		List<Character> list1 = new ArrayList<>(Arrays.asList('p', 'y', 'o', 'l', 'g', 'n', 'o'));

		List<Character> list2 = new ArrayList<>(Arrays.asList('o', 'n', 'p', 'o', 'g', 'y', 'l'));

		if (list1.size() == list2.size()) {

			System.out.println("Both list having the same length characters");

			Collections.sort(list1);
			Collections.sort(list2);
			Boolean anagram = true;

			for (int i = 0; i < list1.size(); i++) {

				if (!list1.get(i).equals(list2.get(i))) {
					System.out.println("Character " + list1.get(i) + " not matched with Character " + list2.get(i));
					anagram = false;
					break;

				}

			}
			if (anagram)
				System.out.println("Both character list is an anagram");

		} else
			System.out.println("Length of the 2 list are not equal");

	}

}
