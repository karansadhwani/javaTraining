// Continue of the program (GetSetMethod.java)

public class ArrayOfObjects{
	
	public static void main(String args[]){
		Circle[] circles;									// Array of the Class Circle is created 
		circles=new Circle[3];								
		
		for(int index=0;index<circles.length;index++){
			System.out.println(circles[index]);
		}
		circles[0]=new Circle(3.3f);
		circles[1]=new Circle(5.5f);
		circles[2]=new Circle(4.4f);
		
		for(int index=0;index<circles.length;index++){
			System.out.println(circles[index].calcArea());
			circles[index].draw();
		}
		
	}
	
	
	
}