package com.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Data_InputStream {

	public static void main(String[] args) {
		File file= new File("H:\\ReadMe.txt");
		int value=0;
		
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(file));
			try {
				while((value=input.read())!= -1){
					System.out.print((char)value);
				}
				System.out.println("");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("DataInputStream ended");
	}

}
