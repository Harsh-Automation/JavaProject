package com.java.practice;

public class ReverseSingleWordInSentence {

	public static void main(String args[]) {
//		String source = "I am a Java QA Developer";
//		String target = "QA";
//		String org_data = "";
//		System.out.println(source.indexOf(target));
//
//		StringBuilder sb = new StringBuilder();
//
//		sb.append(target).reverse();
//		org_data = source.replace(target, sb.toString());
//
//		System.out.println(org_data);
		
		String source = "I am a Java QA Developer";
        String target = "Java";

        // Find the starting index of the target word
        int startIndex = source.indexOf(target);
        if (startIndex != -1) {
            // Create a StringBuilder with the target word
            StringBuilder sb = new StringBuilder(target);
            // Reverse the target word
            sb.reverse();
            // Get the reversed word
            String reversedTarget = sb.toString();
            // Replace the original word with the reversed word
            String result = source.replace(target, reversedTarget);
            // Print the result
            System.out.println(result);
        } else {
            System.out.println("Target word not found in the source string.");
        }

	}
}
