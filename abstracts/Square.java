package com.abstracts;

public class Square extends Shape {
	
	private float side;
	
	public Square(){
		
	}
	
	public Square(float side){
		this.side=side;
	}

	@Override
	public void draw() {
			System.out.println("Square is Drawing....");
	}

	@Override
	public double calcArea() {
		return side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	
	//public boolean equals(){
		
	//}

}
