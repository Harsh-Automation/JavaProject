package com.java.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String args[]) throws IOException {

		File file = new File("./File/config.properties");
		if (file.exists()) {
			FileReader fr = new FileReader(file);
			Properties prop = new Properties();
			prop.load(fr);

			if (!prop.isEmpty()) {

				System.out.println("Reading file =>" + file + "\n");
				System.out.println("Browser is " + prop.getProperty("browser"));
				System.out.println("URL is " + prop.getProperty("url"));
				System.out.println("User is " + prop.getProperty("user"));
				System.out.println("Password is " + prop.getProperty("password"));
			} else {
				System.out.println("Property file is empty");
			}
		} else {
			System.out.println("File not exists");

		}
	}

}
