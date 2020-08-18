// using interfaces

import java.util.*;
interface Calculator{
	
	public abstract int add(int no1,int no2);  //public abstract is default
	int subs(int no1,int no2);					// this is also public abstract int subs() 
}

interface AdvCalculator/*extends Calculator */{ // if we will extend Calculator then we will be able to access add and subs by 
												// the object of AdvCalculator Interface
	
	int mul(int no1, int no2);					// interface
	int div(int no1, int no2);
}

class MyCalculator implements Calculator , AdvCalculator{			// class which implements intefaces
	
	@Override
	public int add(int no1,int no2){
		return no1+no2;
	}
	@Override
	public int subs(int no1,int no2){
		return no1-no2;
	}
	@Override
	public int mul(int no1,int no2){
		return no1*no2;
	}
	@Override
	public int div(int no1,int no2){
		return no1/no2;
	}
	
}



public class Interface{
	
	public static void Main(String args[]){
		
		
		
		
		Calculator calc;							// object of interface Calculator
		AdvCalculator advCalc;						// object of interface AdvCalculator
		
		MyCalculator myCalc;						// object of Class MyCalculator
		myCalc=new MyCalculator();
		
		calc=myCalc;								// Object of Class MyCalculator is now pointing to Interface Calculator
		advCalc=myCalc;								// Object of Class MyCalculator is now pointing to Interface AdvCalculator
		
		calc.add(2,2);								
		System.out.println("Addition is :"+calc.add(2,2));
		calc.subs(2,2);
		advCalc.mul(2,2);
		advCalc.div(2,2);
		
		//advCalc.add(2,2);			// this cannot be implemented bcoz advCalc is different Interface 
									// add  is func of Calculator interface therefore it cannot be pointed by Obj. of AdvCalculator interface 
		
		
		
		
		
	}
	
	
	public static void main(String args[]){
		
		
		Scanner in=new Scanner(System.in);
		String operation;
		int first,second;
		char ans;
		
		Calculator calc;							// object of interface Calculator
		AdvCalculator advCalc;						// object of interface AdvCalculator
		
		MyCalculator myCalc;						// object of Class MyCalculator
		myCalc=new MyCalculator();
		
		calc=myCalc;								// Object of Class MyCalculator is now pointing to Interface Calculator
		advCalc=myCalc;				
		
		
		
		do{
		System.out.println("Enter the First no. :");
		first=in.nextInt();
		System.out.println("Enter the Second no. :");
		second=in.nextInt();
		
		System.out.println("Enter the Operation to be Performed : ");
		operation = in.next();
		
	switch(operation){
		case"+":
				System.out.println("Addition is:"+calc.add(first,second));
				break;
	
		case"-":
				System.out.println("Substraction is:"+calc.subs(first,second));
				break;
				
		case"m":
				System.out.println("Multiplication is:"+advCalc.mul(first,second));
				break;
				
		case"/":
				System.out.println("Division is:"+advCalc.div(first,second));
				break;
		default:
					System.out.println("Please Enter Valid Operator");
	
		}
			System.out.println("Want to continue (y/n)");
			ans=in.next().charAt(0);
		}while(ans=='y' || ans=='Y');
		
		
	}
	
	
}