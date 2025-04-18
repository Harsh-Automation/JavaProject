package com.java.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class FindTwoNumberInArray2 {
	
	
	
    static LocalTime date = LocalTime.now();
  
   

	public static void main(String[] args) {

		int arr[] = { 4, 5, 7, 11, 4, 6, 4 };
		int target = 9;
		int extra;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			extra = target - arr[i];

			if (map.containsKey(extra)) {

				System.out.println("Index for the matching " + target + " is " + arr[i] + "," + extra);
				break;
			} else

				map.put(arr[i], i);
			

		}
		System.out.println(date);

		

	}

}
