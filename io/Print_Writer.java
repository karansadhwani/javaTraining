package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_Writer {

	public static void main(String[] args) {
		
		File file= new File("H:\\ReadMe.txt");
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(file))){
			
			writer.print(101);
			writer.print("Amar");
			writer.print(75.5);
		
		} catch (IOException e) {
			e.printStackTrace();
	}
		
		System.out.println("Done");
	}

}
