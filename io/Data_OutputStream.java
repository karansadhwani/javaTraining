package com.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Data_OutputStream {

	public static void main(String[] args) {
		
		String name="Amit";
		int rollNo= 101;
		float marks= 75.00f;
		File file= new File("H:\\ReadMe.txt");
		
		try {
			DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
			
			try {
				output.writeInt(rollNo);
				output.writeUTF(name);
				output.writeFloat(marks);
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			System.out.println("DataOutputStream Ended");
	}

}
