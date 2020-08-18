package com.lang;

import java.util.Enumeration;
import java.util.Properties;

public class System_Test {

	public static void sop(long longValue) {
		System.out.println(longValue);
	}

	public static void sop(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());

		System.out.println(System.getenv("JAVA_HOME"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.home"));
		System.out.println("Java Version : " + System.getProperty("java.runtime.version"));

		// to read all the properties

		Properties props = System.getProperties();
		props.list(System.out);

		/*
		 * Enumeration keys= props.keys(); // alternate method for
		 * props.list(System.out); while(keys.hasMoreElements()){ String
		 * key=(String)keys.nextElement(); String value= (String)props.get(key);
		 * System.out.println(key + ":" + value ); }
		 */
	}

}
