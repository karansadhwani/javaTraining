// To count the numbers of vowels in the given string.

import java.util.*;


public class Vowels{
	public static void main(String args[]){
				
		String string;
		int vowels=0;
		Scanner in= new Scanner (System.in);
		
		System.out.println("Enter the String :");
		string=in.nextLine();
		
		for(int i=0;i<string.length();i++){
			if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' || string.charAt(i)=='A' || string.charAt(i)=='E' || string.charAt(i)=='I' || string.charAt(i)=='O' || string.charAt(i)=='U'){
				vowels++;
			}
		
	}
	
			System.out.println("The Number of Vowels in the String is :"+vowels);
	
	
	
}
}