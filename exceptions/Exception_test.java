package com.exceptions;

//java Exception Test 10
//java Exception Test 10 0
//java Exception Test 10 a
//java Exception Test 10 5
public class Exception_test {

	public static void main(String[] args) {

		int no1 = 0, no2 = 0, result = 0;
		try {
			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[1]);
			result = no1 / no2;
			System.out.println("Number 1 is:" + no1 + "\t Number 2 is:" + no2);
			System.out.println("Result is :" + result);
		}

		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("PLease Enter the 2nd Number");
		}

		catch (NumberFormatException ex) {
			System.out.println("Please Enter Numeric elements");
		}

		catch (ArithmeticException ex) {
			System.out.println(" / by zero error");
		}

		catch (Exception ex) { // by this every Exception can be handled
			System.out.println("General Error :" + ex.getMessage());
			ex.printStackTrace();
		}
	}

}
