// Generating the random numbers between 1 to 100 and printing them in ascending order.

import java.util.*;
import java.lang.Math;

public class RandomNumber{
	
	public static void main(String args[]){
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array :");
		int index=in.nextInt();
		
		int[] arr;
		arr = new int[index];		// creating array
		
		
		// Code for creating Random Numbers 
		
		for(int i=0 ; i < index ; i++){
			arr[i]=(int)((Math.random()*1000)%101); // Math.random() gives us the double values therefore we have type casted it into Int.
											// also it returns 0.121212 these types of values therefore we have multiplied by 100
		}									// here we have taken the mod of 101 so that it will print the values between 1 to 100 only
											// whenever the number greater than 100 will come it will returns its rtemainder
	
		
		
		System.out.println("\n\n The RandomNumbers are :"+ Arrays.toString(arr));		//printing the random numbers
		
		sortArr(arr);		// calling Sorted array
		oddArr(arr);		//calling Odd array
		evenArr(arr);		//calling Even array
	}
	
	
		// SORTING ARRAY CODE
	
		public static void sortArr(int[] arr){
		
		for(int j=0;j<arr.length;j++){
			for(int k=j+1;k<arr.length;k++){
					
				if(arr[j]>arr[k]){
					int temp;
					temp=arr[k];				// here we are sorting the array 
					arr[k]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.println("The Sorted array is :"+Arrays.toString(arr));				//printing the sorted array
		
		}
	
	
		// ODD ARRAY CODE
		
		
		public static void oddArr(int[] arr){
			int size=arr.length;
			int[] temp;
			int count=0;								
			int j=0;
																		
			for(int k=0;k<size;k++){
				if((arr[k]%2) !=0){
					count++;
				}
			}
			temp = new int [count];
			
														// creating the array for ODD numbers 
			for(int i = 0; i<size ; i++){
				if((arr[i]%2) !=0){
					
					temp[j]=arr[i];
					j++;
				}
			}
			
			System.out.println("Odd array :"+Arrays.toString(temp));
			
		}
		
		// EVEN ARRAY CODE
		
		public static void evenArr(int[] arr){
			int size=arr.length;
			int[] temp;
			int count=0;								
			int j=0;
																		
			for(int k=0;k<size;k++){
				if((arr[k]%2) ==0){
					count++;
				}
			}
			temp = new int [count];
			
														// creating the array for EVEN numbers 
			for(int i = 0; i<size ; i++){
				if((arr[i]%2) ==0){
					
					temp[j]=arr[i];
					j++;
				}
			}
			
			System.out.println("Even array :"+Arrays.toString(temp));
			
		}
	
}