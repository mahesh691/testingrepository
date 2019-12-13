package com.Programmes;

public class ExcceptionExample1 {
int a=10;//Global variable
int b=10;
int c;
public void addition() {
	c=a+b;
	System.out.println("addition two numbers is :"+c);
	
}
	public void division() {
		int a=10;//local variable
		int b=0;
		
		try {
		c=a/b;
		System.out.println("division two numbers is :"+c);
		}catch(Exception p) {
			System.out.println(p);
		}	
	}
	public void subtraction() {
		c=a-b;
		System.out.println("subtraction two numbers is :"+c);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcceptionExample1 m=new ExcceptionExample1();
		m.addition();
		m.division();
		m.subtraction();
	}

}
