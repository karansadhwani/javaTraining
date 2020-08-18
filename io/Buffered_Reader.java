package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Reader {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = null;

		try {
			System.out.println("Enter Message : ");
			input = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Message : " + input);
	}
}
