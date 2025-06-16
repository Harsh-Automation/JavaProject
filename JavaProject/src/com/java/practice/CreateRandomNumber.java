package com.java.practice;

public class CreateRandomNumber {

	public static void main(String[] args) {

		final String char_data = "qwertyuiopasdfghjklzxcvbnmZXCVBNMLKJHGFDSAQWERTYUIOP";

		StringBuilder sb = new StringBuilder();
		String email = "@gmail.com";
		String random_email="";

		

		for (int i = 0; i < 7; i++) {
			
			int num = (int)(Math.random()*char_data.length());
			
			 sb.append(char_data.charAt(num));
			

		}
		random_email=sb+email;
		System.out.println(sb.toString());
		System.out.println(random_email);

	}

}
