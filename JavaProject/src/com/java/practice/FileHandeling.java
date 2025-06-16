package com.java.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandeling {

	public static void main(String[] args) throws IOException {

		String filename = "./file/Test.txt";

		File file = new File(filename);

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);

		}

		br.close();

	}

}
