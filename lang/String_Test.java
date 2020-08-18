package com.lang;

// for String Buffer :- https://docs.oracle.com/javase/7/docs/api/

public class String_Test {

	// main class for simple string operations 
	
	public static void Main(String[] args) {

		String str1 = new String("MET");
		String str2 = "Nashik";

		// java does not support overloading
		// + operators is internally overloaded for string operations

		String str3 = str1 + str2; // METNashik

		System.out.println(str1 + " : " + str2 + " : " + str3);

		str1 = str1 + "Mumbai";
		System.out.println("str1:" + str1); // METMumbai
		str1 = str1.toUpperCase();

		for (int index = 0; index < str3.length(); index++) {
			System.out.println(str3.charAt(index));
		}
		System.out.println(str3 = "MET".concat("Nashik"));
		System.out.println(str3 = str1.concat("Nashik"));

		/*if (str3.endsWith("Nashik") ? true : false) {
			System.out.println("str3 ends with Nashik");
		}*/
			
		if (str3.endsWith("Nashik")){
			System.out.println("str3 ends with Nashik");
		} 
		else{
			System.out.println("str3 does not ends with Nashik");
		}
		System.out.println("str3.indexOf T:" + str3.indexOf('T')); // 2
		
		System.out.println("str3.lastIndexOf T:" + str3.lastIndexOf('T')); 
		
		System.out.println("str3.replace:"+str3.replace('E', 'e'));
		
		System.out.println("str3.subString:"+str3.substring(3)); // Mumbai Nashik
		
		System.out.println("str3.subString:"+str3.substring(9)); // Nashik
		
		//int value=Integer.parseInt("3");
		System.out.println("str3.valueOf:"+str3.valueOf(3));
		
		byte bytes[]= {75,65,82,65,78};
		String strBytes= new String(bytes);
		System.out.println(strBytes); 		//KARAN (ASCII Values of 75,65,82,65,78)

	
	}
	
	
	//	 Main class for String Buffer and its operations  
	
	
	public static void main(String args[]){
		
		StringBuffer string = new StringBuffer("MET Bhujbal Kn. City");
		StringBuffer string2 = new StringBuffer(" Nashik ");
		
		System.out.println("String Length is : "+string.length());
		System.out.println("String Capacity is"+string.capacity());
		
		System.out.println("New String is"+string.append(" Nasik Road"));
		System.out.println("String Length is : "+string.length());
		
		string.append(string2);
		System.out.println(string);
		
		System.out.println(string.capacity());
		
		System.out.println("CharAt(7) : "+string.charAt(7));
	
		System.out.println("Index of K is : "+string.indexOf("K"));

		System.out.println(""+string.delete(12, 15));
		System.out.println("Updated string is : "+string);
		
		System.out.println(string.reverse());
		string.reverse();
		
		System.out.println(string.toString());
	
		System.out.println(string.codePointAt(5));
		

	}

}