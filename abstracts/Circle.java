package com.abstracts;

public class Circle extends Shape{
	
	public Circle(){
		
	}
	
	public Circle(float radius) {
		this.radius = radius;
		
	}

	private float radius;
	
	
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void draw(){
		System.out.println("Circle is drawing....");
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double calcArea(){
		return 3.14*radius*radius;
	}
	
	

	
}
