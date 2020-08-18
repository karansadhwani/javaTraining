package com.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Buffered_InputStream {

	public static void main(String[] args) {

		File file = new File("H:\\ReadMe.txt");
		System.out.println("Path of the file is : " + file.getAbsolutePath());

		byte[] bytes = new byte[10];

		try {
			BufferedInputStream buffInput = new BufferedInputStream(new FileInputStream(file));
			try {
				while ((buffInput.read(bytes, 0, bytes.length) != -1)) {
					System.out.println(new String (bytes));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}

}
