// Implementation of Square using Constructors and Getter and Setter methods.


class Square{
	
	private float side;
	
	public Square(){
		System.out.println("Default Constructor");		// default const
	}
	
	public Square(float side){
		setSide(side);
		System.out.println("Parameterised Constructor");		// parameterised const
	}
	
	public Square(Square otherSide){
		setSide(otherSide.getSide());
		System.out.println("Copy Constructor");				// copy const
	}
	
	public void setSide(float side){
		this.side=side;										// setter
	}
	
	public float getSide(){
		return side;										// getter		
	}
	
	public double areaSq(){
		return side*side;									// area calc
	}
}



public class SquareTest{
	
	public static void main(String args[]){
		
		Square s1,s2,s3;									// objects
		
		
		System.out.println("\n");
		s1=new Square();
		s1.setSide(4);											// default const
		System.out.println("Side is :"+s1.getSide());
		System.out.println("Area is :"+s1.areaSq());
		System.out.println("\n\n");

		
		s2=new Square(5);
		System.out.println("Side is :"+s2.getSide());
		System.out.println("Area is :"+s2.areaSq());				// parameterised const
		System.out.println("\n\n");
		
		s3= new Square(s2);
		System.out.println("Side is :"+s3.getSide());
		System.out.println("Area is :"+s3.areaSq());			// copy const
		System.out.println("\n");
		
	}
	
	
	
}