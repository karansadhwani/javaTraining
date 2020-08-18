package com.exceptions;

class SubException extends Exception {
	public SubException(String message) {
		super(message);
	}

}

class Calculator {

	public int sub(int no1, int no2) throws SubException {
		if (no2 < 0)
			throw new SubException("Can not substract by negative argument....");
		int result = no1 - no2;
		return result;
	}
	/*try
	{
		result=objCalculator.sub(10,0);
	}
  catch(SubException ex)
	{
	  ex.printStackTrace();		//ex.printStackTrace();

	  
	}*/
	public int div(int no1, int no2) {

		if (no2 <= 0)
			throw new IllegalArgumentException("Can not divide by zero argument....");
		int result = no1 / no2;
		return result;
	}

}

public class Calculator_Exception_Test {

	public static void main(String[] args) {
		Calculator objCalculator;
		objCalculator = new Calculator();
		int result = 0;
		result = objCalculator.div(10, 0);
		System.out.println("Result : " + result);

		result = objCalculator.sub(10, 0);
		System.out.println("Result : " + result);
	}

}
