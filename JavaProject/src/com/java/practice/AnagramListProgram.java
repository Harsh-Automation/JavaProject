package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnagramListProgram {

	public static void main(String[] args) {

		List<Character> first_list = new ArrayList<>(Arrays.asList('a', 'n', 'd'));

		List<Character> second_list = new ArrayList<>(Arrays.asList('n', 'd', 'a'));

		Collections.sort(first_list);
		Collections.sort(second_list);

		System.out.println("First List " + first_list);
		System.out.println("Second List " + second_list);

		if (first_list.size() != second_list.size()) {
			System.out.println("Both List characters are different");
		} else {

			boolean isAnagram = true;
			for (int i = 0; i < first_list.size(); i++) {
				if (!first_list.get(i).equals(second_list.get(i))) {
					System.out.println("Two list is not anagram list");
					isAnagram = false;
					break;

				}

			}
			if (isAnagram) {
				System.out.println("Two list is an anagram list");
			}

		}

	}

}
