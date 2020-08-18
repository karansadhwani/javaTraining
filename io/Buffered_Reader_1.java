package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Reader_1 {

	public static void main(String[] args) throws IOException {
		
		File file= new File("H:\\Readme.txt");
		//int value=0;
		String line=null;
		
			try(BufferedReader buffReader = new BufferedReader(new FileReader(file))) {
				
				while((line = buffReader.readLine()) != null){
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
	
			
			
	}
	}
			/*try {
				while((value = input.read())!= -1){
					System.out.print((char)value);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		}*/
	

