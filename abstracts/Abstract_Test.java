package com.abstracts;

import java.util.Scanner;

//import java.util.*;
public class Abstract_Test {
	public static void Main(String args[]) {

		// Parameterized Constructor of Circle is called
		Circle circle1;
		circle1 = new Circle(3.0f);
		circle1.draw();
		System.out.println("The radius is:" + circle1.getRadius());
		System.out.println("Area is :" + circle1.calcArea());
		System.out.println(circle1.toString());
		System.out.println("\n\n");

		// Default Constructor is called
		Circle circle2;
		circle2 = new Circle();
		circle2.draw();
		circle2.setRadius(2.2f);
		System.out.println("The radius is:" + circle2.getRadius());
		System.out.println("Area is :" + circle2.calcArea());
		System.out.println(circle2.toString());
		System.out.println("\n\n");

		// Square Parameterized....
		Square square;
		square = new Square(5);
		square.draw();
		System.out.println("Side is :" + square.getSide());
		System.out.println("Area is : " + square.calcArea());
		System.out.println(square.toString());
		System.out.println("\n\n");

		// Square Default
		square.setSide(3);
		square.draw();
		System.out.println("Side is :" + square.getSide());
		System.out.println("Area is : " + square.calcArea());
		System.out.println(square.toString());
		System.out.println("\n\n");

		// Rectangle Parameterized....
		Rectangle rectangle;
		rectangle = new Rectangle(5, 3);
		rectangle.draw();
		System.out.println("Length is :" + rectangle.getLength());
		System.out.println("Breadth is :" + rectangle.getBreadth());
		System.out.println("Area is : " + rectangle.calcArea());
		System.out.println(rectangle.toString());
		System.out.println("\n\n");

		// Square Default
		rectangle.setLength(3);
		rectangle.setBreadth(4);
		rectangle.draw();
		System.out.println("Length is :" + rectangle.getLength());
		System.out.println("Breadth is :" + rectangle.getBreadth());
		System.out.println("Area is : " + rectangle.calcArea());
		System.out.println(rectangle.toString());

	}

	public static void main(String args[]) {
		int choice;
		char ans;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Enter the Shape");
			choice = in.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Radius: ");
				float radius = in.nextFloat();
				Circle circle;
				circle = new Circle(radius);
				circle.draw();
				System.out.println("Radius is :" + circle.getRadius());
				System.out.println("Area is :" + circle.calcArea());
				break;

			case 2:
				Square square;
				square = new Square();
				System.out.println("Enter Side: ");
				float side = in.nextFloat();
				square = new Square(side);
				System.out.println("Side is :" + side);
				System.out.println("Area is :" + square.calcArea());
				break;

			case 3:
				Rectangle rectangle;
				rectangle = new Rectangle();
				System.out.println("Enter the Length");
				float length = in.nextFloat();
				System.out.println("Enter the Breadth");
				float breadth = in.nextFloat();
				System.out.println("Length is:" + length + "\tBreadth is :" + breadth);
				System.out.println("Area is :" + rectangle.calcArea());
				break;

			default:
				System.out.println("Enter valid operator");

			}
			System.out.println("Do you want to perform operation again?");
			ans = in.next().charAt(0);
		} while (ans == 'y');
	}

}
