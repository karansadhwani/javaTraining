import java.util.*;

public class Array{
	
	public static void main(String args[]){
		
		int score=10;
		System.out.println("The score is :"+score);
		
		int[] scores;		//declaration 
		
		scores=new int[5];
		
		//memory is allocated and default value are set
		
		//Initialization
		
		scores[0]=0;
		scores[1]=10;
		scores[2]=20;
		scores[3]=30;
		scores[4]=40;
		
		System.out.println("Lenght :"+scores.length);
		
		for(int index=0 ; index < scores.length ; index++){
			
			System.out.println(scores[index]);
		}
		
		int[] scores2={0,10,20,30,40};
		System.out.println("\n\n Arrays using toString Function");
		System.out.println(Arrays.toString(scores2));
		
		
	}
	
	
	
}