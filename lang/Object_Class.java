package com.lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Object_Class {  // Student class is inherited in this program using package

	public static void main(String[] args){
		Student student = new Student(101,"Amar");
	
		Class studentClass = student.getClass();
		
		System.out.println(studentClass);
		System.out.println(studentClass.getName());
		
		Constructor[] constructors = studentClass.getConstructors();
		Field[] fields = studentClass.getFields();
		Method[] methods = studentClass.getMethods();
		Class superclass = studentClass.getSuperclass();
		Class[] interfaces = studentClass.getInterfaces();
		Package package1= studentClass.getPackage();
		
		int a = 10;
		Integer objInt1 = new Integer(a);
		Integer objInt2 = new Integer(20);
		
				int result = objInt1 + objInt2;
				System.out.println("Result is:"+result);
				
				Integer objSum= 10+20+30;
				result=add(10,20);
				result=add(objInt1 , objInt2);
	
	}
	
	public static int add(int no1 , int no2){
		System.out.println("add int...");
		return no1 + no2;
	}
	public static int add(Integer no1 , Integer no2){
		System.out.println("add Integer...");
		return no1 + no2;
	}
	
}


