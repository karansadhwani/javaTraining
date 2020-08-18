public class DoWhile{
	
	public static void main(String args[]){
		
		System.out.println("WhileLoop....");
		System.out.println("Argument"+args[0]);
		
		int start=1;
		
		int end=Integer.parseInt(args[0]);	//Converting from Int to char
		
		
			do{
			System.out.println("\n"+start);
			start++;
			}
			while(start==10); //Expression (it returns Boolean values)
		
	}
	
	
}