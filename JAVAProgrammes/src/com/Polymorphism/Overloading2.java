package com.Polymorphism;
//Method Overloading: changing data type of arguments

class addition{
	static int add1(int a,int b) {
		int c=a+b;
		return c;
	}
	
	static double add2(double a,double b) {
		double c=a+b;
		return c;
	}
	
}
public class Overloading2 {

	
	public static void main(String[] args) {
		System.out.println(addition.add1(10, 20));
		System.out.println(addition.add2(10.32, 23.39));
	}
}
