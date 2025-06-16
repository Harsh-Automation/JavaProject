package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class ReplaceDuplicateCharacterWith2 {

	public static void main(String[] args) {
		String source = "automation";

		Map<Character, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		for (char ch : source.toCharArray()) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : source.toCharArray()) {
			int count = map.get(ch);
			if (count > 1) {
				sb.append(count);
				map.put(ch, 0);

			} else if(count == 1)
			{
					sb.append(ch);
		}
	}
		System.out.println(sb.toString());
		
	}
}
