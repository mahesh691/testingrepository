package com.ThisKeywords;

public class B extends SuperKey{
	
	int a=10;
	void show(int a) {
		System.out.println(a);
		System.out.println(this.a);//current class instance
		System.out.println(super.a);//parent class superkey instance
	}
public static void main(String[] args) {
	B tb = new B();
	tb.show(300);
}
}
