package com.interfaces;

interface AdvCalculator/* extends Calculator */ { // if we will extend
													// Calculator then we will
													// be able to access add and
													// subs by
													// the object of
													// AdvCalculator Interface

	int mul(int no1, int no2); // interface

	int div(int no1, int no2);
}