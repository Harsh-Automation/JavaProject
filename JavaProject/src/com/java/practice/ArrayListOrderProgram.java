package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListOrderProgram {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(16, 30, 69, 90, 100, 35));

		List<Integer> new_list = new ArrayList<Integer>();

		Collections.sort(list);

		System.out.println("Original list is : " + list);

		for (int i = list.size()-1; i >= 0; i--) {

			new_list.add(list.get(i));

		}
		System.out.println("List in descending order : " + new_list);

	}

}
