package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateelementfromArraySet {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(6, 3, 5, 6, 35, 23, 31, 11));

		Set<Integer> set = new HashSet<Integer>(list);

		System.out.println(set);

	}

}
