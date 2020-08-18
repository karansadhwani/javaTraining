// To display the ASCII code of the  Number
import java.util.*;
public class ASCII{
	
	public static void main(String args[]){
		
		for(int index=0; index<255 ; index++){
			System.out.println((char)index);
			
			if(index % 8==7){
				System.out.write('\n'); //Breal line after every 8th character
			
			}
			else{
				System.out.write('\t');  // new tab feed
			}
		}
		
	}
	
}