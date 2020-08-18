public class ForLoop{
	
	public static void main(String args[]){
		
		//To Check Whether the Argument has been Given or not
		
		if (args.length==0){
			System.out.println("Please Provide Arguments");	//If the arguments are not passed then it will return this
			
		}
		else{
		
		int end=Integer.parseInt(args[0]);  	//Converting the the String from int to char 
		for(int start=0 ; start<end ; start++){
			System.out.println(start);
		}
		}
		
		
		
	}
	
}