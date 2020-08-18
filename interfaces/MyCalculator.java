package com.interfaces;
class MyCalculator implements Calculator , AdvCalculator{			// class which implements intefaces
	
	@Override
	public int add(int no1,int no2){
		return no1+no2;
	}
	@Override
	public int subs(int no1,int no2){
		return no1-no2;
	}
	@Override
	public int mul(int no1,int no2){
		return no1*no2;
	}
	@Override
	public int div(int no1,int no2){
		return no1/no2;
	}
	
}
