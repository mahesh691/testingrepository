package com.Methods_inheritance;

public class Test2 extends Test1 {
	protected void method3() {
		System.out.println("method 3  successfull");
	}
	private void method4() {
		System.out.println("method 4  successfull");
	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.method3();
		t2.method4();
		
	}
}
