package com.java.practice;


public class StringCompressor {
    public static void main(String[] args) {
        String input = "aaabba";
        
        System.out.println(input.length());
        String output = compressString(input);
        System.out.println(output);
    }

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            // Check if the next character is the same as the current one
            if (i < input.length()-1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Append the character and its count if greater than 1
                compressed.append(input.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1; // Reset count for the next character
            }
        }

        return compressed.toString();
    }
}