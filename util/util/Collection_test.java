package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_test {

	public static void main(String[] args) {

		String[] weekdays = { "Sun", "Mon", "Tue", "Wed", "Thu", "Free", "Sat" };

		for (String day : weekdays) { // Traditional Method..
			System.out.println(day);
		}

		ArrayList WeekDays = new ArrayList<>(); // Array List
		// LinkedList<String> WeekDays = new LinkedList<>(); // Linked List
		// Vector<String> WeekDays = new Vector<>(); // Vector

		System.out.println(WeekDays.size() + ":" + WeekDays);

		WeekDays.add("Mon"); // Add Function
		WeekDays.add("Tue");
		WeekDays.add("Wed");

		System.out.println(WeekDays.size() + ":" + WeekDays); // Size function

		WeekDays.add("Free");
		WeekDays.add("Sat");
		WeekDays.add("Sun");

		System.out.println(WeekDays.size() + ":" + WeekDays);

		WeekDays.add(3, "Thu");

		System.out.println(WeekDays.size() + ":" + WeekDays);

		WeekDays.remove(0); // Remove function

		System.out.println(WeekDays.size() + ":" + WeekDays);

		WeekDays.set(3, "Fri"); // Set function

		System.out.println(WeekDays.size() + ":" + WeekDays);

		Iterator<String> itr = WeekDays.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		int[] nums = { 1, 3, 5, 4, 2 }; // Primitive datatype array

		System.out.println("Array Displayed using toString() :" + Arrays.toString(nums));
		Arrays.sort(nums); // Primitive data sorting
		System.out.println("Sorted array :" + Arrays.toString(nums));

		// for sorting ArrayList we have to use Collections.
		// Weekdays cannot be sorted using toString() bcoz WeekDays is ArrayList
		// Therefore We have to use Collections.sort() for sorting it.
		Collections.sort(WeekDays); // arrayList Sorting
		System.out.println("Sorting using Collections Class :" + WeekDays);

	}
}
