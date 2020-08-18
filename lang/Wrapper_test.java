package com.lang;

public class Wrapper_test {

	public static void main(String args[]){
		boolean married= true;		// primitive boolean type
		System.out.println("boolean"+married); // prints true 
		
		Boolean objBoolean;		// object boolean (Wrapper class : Boolean)
		objBoolean=new Boolean(true);		//Initialized objBoolean through Constructor
		objBoolean=new Boolean("false");
		
		System.out.println("boolean"+objBoolean);		// prints false
		
		// object boolean type converted into primitive into boolean type
		married= objBoolean.booleanValue();		//booleanValue() --> primitive type
		System.out.println("boolean"+married);		// prints false
		
		// primitive boolean type converted into object Boolean type
		
		objBoolean=Boolean.valueOf(false);
		System.out.println("objBoolean:"+objBoolean);
		
		if (married==true ? true : false)
			System.out.println("primirive boolean is true ");
		else 
			System.out.println("primitive boolean is false ");
		
		if(objBoolean== true ? true : false)
			System.out.println("object boolean is true ");
		else 
			System.out.println("object boolean is false ");
		
	}
}
