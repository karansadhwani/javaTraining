package com.util;

// Implemented List,ArrayList,HashSet,LinkedHashSet,TreeSet


import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collection_test_3 {

	public static void main(String[] args) {

		// String[] weekdays = { "Sun", "Mon", "Tue", "Wed", "Thu", "Free",
		// "Sat" };

		// unique set of values(no duplicates)
		// one null is allowed
		// Insertion order is NOT maintained
		// insertion based on HashSet()

		 HashSet<String> hs = new HashSet<>();
		//LinkedHashSet<String> hs = new LinkedHashSet<>();
		//TreeSet<String> hs= new TreeSet<>(); // TreeSet already sorts the elements
		
		System.out.println("Size is :" + hs.size() + " Elements are :" + hs);

		// hs.add(null); //one null is allowed
		// hs.add(null); // another null will replace the previous one

		hs.add("Sun");
		hs.add("Mon");
		hs.add("Tue");
		hs.add("Wed");
		hs.add("Thu");
		hs.add("Fri");

		System.out.println("Size is :" + hs.size() + " Elements are :" + hs);

		if (hs.contains("Wed")) {
			hs.remove("Wed");
		} else {
			System.out.println("Wed is not present");
		}

		System.out.println("Size is :" + hs.size() + " Elements are :" + hs);

		// As we cannot sort SETs thats why we will converting it into LIST
		// and then we will perform the Sorting Operation

		ArrayList temp = new ArrayList(hs);
		Collections.sort(temp);

		System.out.println("Size is :" + temp.size() + " Sorted Elements are :" + temp);

		
		
	}

}
