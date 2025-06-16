package com.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapProgram {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("first_name", "Ashwin");
		map.put("email", "ashwin.patil@gmail.com");
		map.put("last_name", "Patil");

		System.out.println(map.get("email"));
		System.out.println("========================================");

		for (String key : map.keySet()) {

			System.out.println(key + " is " + map.get(key));

		}
		System.out.println();

		System.out.println("=================By using KeySet method=======================");
		System.out.println();

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {

			String key = it.next();
			String value = map.get(key);

			System.out.println("Key is " + key + " value is " + value);
		}
		System.out.println();

		System.out.println("=================By Using entrySet method=======================");
		System.out.println();

		Iterator<Entry<String, String>> iEntry = map.entrySet().iterator();

		while (iEntry.hasNext()) {

			Entry<String, String> entry = iEntry.next();

			System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());

		}

	}

}
