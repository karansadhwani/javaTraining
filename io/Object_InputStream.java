package com.io;

import java.io.*;

public class Object_InputStream {

	public static void main(String[] args) throws ClassNotFoundException {

		File file = new File("H:\\Student.dat");
		System.out.println(file.getAbsolutePath());

		try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(file))) {
			System.out.println(objectInput.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
