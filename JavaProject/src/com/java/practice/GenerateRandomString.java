package com.java.practice;

import java.util.Random;
import java.util.UUID;

public class GenerateRandomString {

	public static void randomAlphanumberic(int size) {
		String alpha_num = "1234567890qwertyuiopasdfghjklzxcvbnm";
		String random_alphanum = "";

		Random random = new Random();

		for (int i = 0; i < size; i++) {

			int index = random.nextInt(alpha_num.length());

			random_alphanum = random_alphanum + alpha_num.charAt(index);

		}

		System.out.println("Generated alphanumeric string with " + size + " is : " + random_alphanum);

	}

	public static void randomAlphanumbericByUUID(int length) {

		String randomUUID = UUID.randomUUID().toString();
		
		String randomAlphanum = randomUUID.substring(0, length);

		System.out.println("Generated alphanumeric string with " + length + " is : " + randomAlphanum);
	}

	public static void main(String[] args) {

		randomAlphanumberic(10);
		randomAlphanumbericByUUID(7);

	}

}
