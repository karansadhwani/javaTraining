package com.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered_OutputStream {

	public static void main(String[] args) {
		
		File file = new File("H:\\ReadMe.txt");
		
		String str1= "Line....1";
		String str2= "Line....2";
		String str3= "Line....3";
		try(BufferedOutputStream  bufferedOutput = new BufferedOutputStream(new FileOutputStream(file))) {
			bufferedOutput.write(str1.getBytes());
			bufferedOutput.write(str2.getBytes());
			bufferedOutput.write(str3.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Writing Done");
	}

}
