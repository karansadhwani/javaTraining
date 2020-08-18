package com.util;

import java.util.PriorityQueue;

import javax.print.DocFlavor.STRING;

public class Collection_test_4 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Abhishek");
		pq.add("Pradeep");
		pq.add("Karan");
		pq.add("Aashish");
		pq.add("Anuj");

		System.out.println("Elements are :" + pq.toString());

		System.out.println("Head at :" + pq.element());
		System.out.println("Head at :" + pq.peek());

		System.out.println("Removed Element : " + pq.remove());
		System.out.println("Elements are :" + pq.toString());

		System.out.println("Head at :" + pq.element());
		System.out.println("Head at :" + pq.peek());

		System.out.println("" + pq.poll());
		System.out.println("Poll :" + pq);

		System.out.println("Remove :" + pq.remove() + "\n" + pq);
	}

}
