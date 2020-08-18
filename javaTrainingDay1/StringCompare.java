public class StringCompare{
	public static void main(String args[]){
		String str1,str2,str3,str4;
		
		str1="Amar";		// they will be pointing to the same memory locations
		str2="Amar";
		
		if (str1==str2){
			System.out.println("str1 == str2");
		}
		else{
			System.out.println("str1 != str2");
		}
		
		str3= new String("Amar");		// they both will be pointing to the different memory locations  
		str4= new String("Amar");		// because of new keyword different memory locations are created
		
		if(str3==str4){
			System.out.println("str3 == str4");
		}
		else{
			System.out.println("str3 != str4");
		}
			
		
		
		
	}
	
	
	
}