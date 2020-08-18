package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Buffered_Writer {

	public static void main(String[] args) {

		File file = new File("H:\\ReadMe.txt");
		String str = "Hello Indians !!";

		try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(file))) {

			buffWrite.write(str);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
