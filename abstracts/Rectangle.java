package com.abstracts;

public class Rectangle {
	float length,breadth;
	
	public Rectangle(){
		
	}
	public Rectangle(float length,float breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void draw(){
		System.out.println("Rectangle is Drawing....");
	}
	
	public double calcArea(){
		return length*breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
}
