package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.Object;


public class Random_Access_File {
	
	public static void main(String[] args) {
			File file= new File("H:\\ReadMe.txt");
			int value=0;
			
			try (RandomAccessFile objectOutput = new RandomAccessFile(file, "r")) {
				/*
				while((value=objectOutput.read())!= -1){
				System.out.println((char)objectOutput.read());
				objectOutput.skipBytes(1);
				}*/
				
				long eof = objectOutput.length();
				System.out.println("Pointer : "+objectOutput.getFilePointer());
				objectOutput.seek(eof);
				System.out.println("Pointer : "+objectOutput.getFilePointer());
				
				while(eof != 0){
					eof--;
					objectOutput.seek(eof);
					value= objectOutput.read();
					System.out.println((char) value);
				}
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			
			
	}
}
