// Draw the circle and use Equals method(@override it). 
class Circle{
		
				private float radius;
				
				
				// default constructor
				
				public Circle(){
					//setRadius(0.0f);
					System.out.println("Circle--> default");
				}
				
				
				// parameterised constructor
				
				public Circle(float radius){
					setRadius(radius);
					System.out.println("Circle--> parametrised");
				}

				// copy constructor

				public Circle(Circle otherClass){
					setRadius(otherClass.getRadius());
					System.out.println("Circle-->Copy");
				}		
				
				// Get Method 
				public float getRadius(){
					return radius;
				}
				
				// Set method
				
				public void setRadius(float radius){
					if(radius>0.0f && radius<12.00){
						this.radius=radius;						//this.radius is the radius of  Circle();
					}											//radius is the parameter
					else{
						System.out.println("Enter Radius Between 1 to 12");		// if the radius is set greater than 12 then it will return.
					}
															
				}											
				
				@Override								// for compiler to check the method signature in java.lang.Object class
				public String toString(){				
					return "Radius :"+getRadius();		// by default toString() is used to return the class name and address of the objects
				}										// by using @Override we can implement what we want like here we wanted to return the Radius 
														// therefore we have overridden the toString() and now it will be returning Radius 
														
														
														
														
				public boolean equals (Object obj){					// @Override Equals Method 
					System.out.println("In Equals....");
					
					if(obj==null){return false;}					// Checking for whether obj is null
					if (obj==this){return false;}					// Checking that obj should not point itself 
					if (!(obj instanceof Circle)){return false;}	// obj should be the instance of class if not then return false	
					
					Circle otherCircle=(Circle) obj;				// type casting
					
					if(radius == otherCircle.getRadius()){			//checks for the condition if c1 = c2 
						//System.out.println("String is Equal");
						return true;
					}
					else{
						return false;
					}		
					
				}										
				
				public double calcArea(){
					return radius*radius*3.14;
				}
				public void draw(){
					System.out.println("Area is drawn....");
				}
				
			}


public class EqualsMethod{
	
	public static void main(String args[]){
		Circle c1,c2,c3;			// objects declaration
		
		
		//Default Constructor
		c1 = new Circle();			// obj init.
		c1.draw();
		c1.setRadius(6.00f);
		System.out.println("Radius :"+c1.getRadius());
		System.out.println("Area :"+c1.calcArea());
		System.out.println("\n\n");
		
		//Parameterised Const....
		c2=new Circle(5.5f);
		c2.draw();
		System.out.println("Radius is :"+c2.getRadius());
		System.out.println("Area is :"+c2.calcArea());
		System.out.println("\n\n");
		
		// copy constructor	
		c3=new Circle(c1);
		c3.draw();
		System.out.println("Radius is :"+c3.getRadius());
		System.out.println("Area is :"+c3.calcArea());
		System.out.println("\n\n");
		
			
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		if(c1.equals(c2)){
			System.out.println("c1 equals c2....");				// Overrided Equals() method 
		}
		else{
			System.out.println("c1 NOT Equals to c2");
		}
		
	}
	
	
}