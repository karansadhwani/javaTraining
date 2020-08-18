package com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Collection_test_2 {

	public static void main(String[] args) {

		Student s1= new Student(101, "Amar", 75.55f);
		Student s2= new Student(103, "Akbar", 65.55f);
		Student s3= new Student(102, "Amar", 55.55f);
		
		ArrayList<Student> lst_student = new ArrayList<>();
		//HashSet<Student> lst_student = new HashSet<>();
		//TreeSet<Student> lst_student = new TreeSet<Student>();
		
		lst_student.add(s1);
		lst_student.add(s2);
		lst_student.add(s3);
		
		Collections.sort(lst_student);
		System.out.println(lst_student);
	}

}

class Student implements Comparable<Student> {
	
//class Student{
int rollNo;
	String name;
	float marks;
	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public Student(int rollNo, String name,float marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(Student otherStudent){
		return this.rollNo-otherStudent.rollNo;
	}
	
}
