// Performing Basic operations(Switch case, Input from user , Static functions) by creating Calculator.

import java.util.*;
public class Calculator{
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int result;
		
		
		System.out.println("Enter the first number :");
		int num1= sc.nextInt();
		
		System.out.println("Enter the second number :");
		int num2= sc.nextInt();
		
		System.out.println("Enter the Operator(+,-,m,/) :");
		String operator= sc.next();
		
		switch(operator){
			case "+":
					result=num1+num2;
					System.out.println("Result :"+result);
					break;
					/*result=add(num1 , num2);
					System.out.println("Result :"+result);*/		//alternate method using functions
			case "-":
					result=num1-num2;
					System.out.println("Result :"+result);
					break;
					
			case "m":
					result=num1*num2;
					System.out.println("Result :"+result);
					break;
			case "/":
					result=num1/num2;
					System.out.println("Result :"+result);
					break;
			default:
					System.out.println("Enter the Correct Operator");
		}
		
	/*	public static int add(int num1 , int num2){
			return num1 + num2;								// alternate method using functions
		}
		public static int subs(int num1 , int num2){
			return num1 - num2;
		}
		public static int mul(int num1 , int num2){
			return num1 * num2;
		}
		public static int div(int num1 , int num2){
			return num1 / num2;
		}
		
		*/
	}
	
	
}