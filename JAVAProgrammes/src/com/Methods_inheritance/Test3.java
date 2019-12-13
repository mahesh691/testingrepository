package com.Methods_inheritance;

public class Test3 extends Test2 {
	void method5() {
		System.out.println("method 5 successfull");
	}
	
	 void method6() {
		System.out.println("method 6  successfull");
	}
	
	public static void main(String[] args) {
		Test3 t3 =new Test3();
		t3.method5();
		t3.method6();
	
		
	}
}
