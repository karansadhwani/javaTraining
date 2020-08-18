//To find whether the given number is Armstrong Number or not.

import java.util.*;

public class ArmStrongNo{
	
	public static void main(String args[]){
		
		int iput,sum=0, temp,r;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("\t\t Enter the number that has to be checked that is it Armstrong number:");
		int input =in.nextInt();
		
		temp=input;
		
		while(temp!=0){
			r = temp % 10;
			sum = sum + r*r*r;
			temp=temp/10;
			
		}
		
		if(input==sum){
			System.out.println("\t\t The given number is an Armstrong Number");
		}
		else{
			System.out.println("\t\t The given Number is not an Armstrong Number");
		}
		
		
		
	}
	
	
	
}