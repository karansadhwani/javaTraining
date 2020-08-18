import java.util.*;

public class ArrayCopy{
	
	public static void main(String args[]){
		
		int[] array1={1,45,56,73,81,54};
		int[] array2={2,53,74,23,86,35};
		
		System.out.println("Initially Array 1 :"+Arrays.toString(array1));
		System.out.println("Initially Array 2 :"+Arrays.toString(array2));
		
		System.Array.Copy(array1,array2,3);
		
		System.out.println("After System Copy Array 1 :"+Arrays.toString(array1));
		System.out.println("After System Copy Array 2 :"+Arrays.toString(array2));
		
	}
	
	
}