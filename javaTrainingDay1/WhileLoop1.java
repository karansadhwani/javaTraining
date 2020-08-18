public class WhileLoop1{
	
	public static void main(String args[]){
		
		System.out.println("WhileLoop....");
		System.out.println("Argument"+args[0]);
		
		int start=1;
		
		int end=Integer.parseInt(args[0]);
		
		while(start<end){
			
			System.out.println("\n"+start);
			start++;
			
		}
		
	}
	
	
}