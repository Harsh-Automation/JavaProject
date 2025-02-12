package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("first_name", "Ashwin");
		map.put("email", "ashwin.patil@gmail.com");
		map.put("last_name", "Patil");

		System.out.println(map.get("email"));



			for (String key : map.keySet()) {

				System.out.println(key+ " is " +map.get(key));


			}


	}

}
