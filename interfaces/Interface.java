package com.interfaces;

import java.util.*;

public class Interface {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		String operation;
		int first, second;
		char ans;
		

		Calculator calc; // object of interface Calculator
		AdvCalculator advCalc; // object of interface AdvCalculator

		MyCalculator myCalc; // object of Class MyCalculator
		myCalc = new MyCalculator();

		calc = myCalc; // Object of Class MyCalculator is now pointing to
						// Interface Calculator
		advCalc = myCalc;

		do {
			System.out.println("Enter the First no. :");
			first = in.nextInt();
			System.out.println("Enter the Second no. :");
			second = in.nextInt();

			System.out.println("Enter the Operation to be Performed : ");
			operation = in.next();

			switch (operation) {
			case "+":
				System.out.println("Addition is:" + calc.add(first, second));
				break;

			case "-":
				System.out.println("Substraction is:" + calc.subs(first, second));
				break;

			case "m":
				System.out.println("Multiplication is:" + advCalc.mul(first, second));
				break;

			case "/":
				System.out.println("Division is:" + advCalc.div(first, second));
				break;
			default:
				System.out.println("Please Enter Valid Operator");

			}
			System.out.println("Want to continue (y/n)");
			ans = in.next().charAt(0);
		} while (ans == 'y' || ans == 'Y');

	}

}
