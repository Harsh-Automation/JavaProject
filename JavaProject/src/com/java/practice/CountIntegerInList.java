package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CountIntegerInList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(3, 6,2, 4, 3, 6, 4, 5, 5));

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer integer : list) {

			map.put(integer, map.getOrDefault(integer, 0) + 1);
		}

		System.out.println(map);
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {

			Entry<Integer, Integer> entry = itr.next();

			System.out.println(entry.getKey() + " is occured by " + entry.getValue());

		}

	}

}
