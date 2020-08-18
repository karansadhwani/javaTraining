import java.util.*;
public class WeekDays{
	
	public static void main1(String args[]){
		
		Scanner in = new Scanner (System.in);
		String day;
		
		System.out.print("Enter the Day :");
		day=in.next();
		System.out.print("Day : "+day);
		
		
		if(day.equals("Sunday")){
			System.out.println("\n Today is the 2nd Day of Weekend");
		}
		else if(day.equals("Saturday")){
			System.out.println("\n Today is 1st Day of wekend");
		}
		
		else{
			System.out.println("\n Today is not WeekEnd");
		}
		
	}
}