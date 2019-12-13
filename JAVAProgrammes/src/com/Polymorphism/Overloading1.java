package com.Polymorphism;

class Subtract{

	static int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	
	static int sub(int a,int b,int c) {
		int x=a-b-c;
		return x;
	}
	
//	Method Overloading: changing no. of arguments
	
}
public class Overloading1 {

	public static void main(String[] args) {
		System.out.println(Subtract.sub(12, 3));
		System.out.println(Subtract.sub(10, 20, 21));
	}
	
}
