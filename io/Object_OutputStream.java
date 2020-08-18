package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Student.java

public class Object_OutputStream {

	public static void main(String[] args) {

		Student s1 = new Student(101, "Karan", 75.00f);

		File file = new File("H:\\Student.dat");

		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ended->Object_OutputStream");
	}

}
