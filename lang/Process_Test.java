package com.lang;

import java.io.IOException;

public class Process_Test {

	public static void main(String[] args) throws Exception  {
		
		Runtime runtime= Runtime.getRuntime();
		Process processNotepad = runtime.exec("notepad.exe");
		Process processPaint= runtime.exec("mspaint.exe");
		Process processCalc= runtime.exec("calc.exe");
		
		long maxMemory = runtime.maxMemory();
		long totalMemory= runtime.totalMemory();
		
		// to force GC
		runtime.gc();
		System.out.println("Max Memory is:"+runtime.maxMemory());

		System.out.println("Toal Memory is:"+runtime.totalMemory());
	
	}

}
