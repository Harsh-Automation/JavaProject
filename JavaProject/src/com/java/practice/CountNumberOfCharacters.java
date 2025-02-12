package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters {

	public static void main(String[] args) {
		String name = "Harsh sapariya";

		char[] char_name = name.toLowerCase().replace(" ", "").toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : char_name) {

			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		System.out.println(map);

	}

}