
class Circle{
		
				double radius,pradius;
				
				public Circle(){
					radius=0.0f;
					System.out.println("Circle--> default");
				}
				
				public Circle(float pradius){
					radius=pradius;
					System.out.println("Circle--> parametrised");
				}

				public Circle(Circle otherClass){
					radius=otherClass.radius;
					System.out.println("Circle-->Copy");
				}		
				
				public double calcArea(){
					return radius*radius*3.14;
				}
				public void draw(){
					System.out.println("Area is drawn....");
				}
				
			}


public class Circle_test{
	
	public static void main(String args[]){
		Circle c1,c2,c3;
		
		c1 = new Circle();		
		c1.draw();
		System.out.println("\n\n Area :"+c1.calcArea());
		
		c2=new Circle(5.5f);
		c2.draw();
		System.out.println("\n\n Area is :"+c2.calcArea());
			
		c3=new Circle(c1);
		c3.draw();
		System.out.println("\n\n Area is :"+c3.calcArea());
	}
	
}