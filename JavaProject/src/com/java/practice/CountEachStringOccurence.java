package com.java.practice;




/*
 * Java program
 * 
 * Input string : "Hey Java I am Java am Java"
 * 
 * Output : Occurance of Word Java is 3
 * Occurance of Word I is 1
 * Occurance of Word am is 2
 * Occurance of Word Hey is 1
 * 
 */
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountEachStringOccurence {

	public static void main(String[] args) {

		String sentence = "Hey Java I am Java am Java";
		String[] str_arr = sentence.split(" ");

		System.out.println(Arrays.toString(str_arr));

		Map<String, Integer> map = new HashMap<>();

		for (String data : str_arr) {
			if (map.containsKey(data)) {
				map.put(data, map.get(data) + 1);
			} else {
				map.put(data, 1);

			}

		}

		Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

		while (it.hasNext()) {

			Map.Entry<String, Integer> it_map = it.next();

			System.out.println(it_map.getKey() + " " + it_map.getValue());
		}

		for (String word : map.keySet()) {
			System.out.println("Occurance of Word " + word + " is " + map.get(word));

		}

	}

}
