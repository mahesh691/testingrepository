package com.ThisKeywords;

public class ThisKey {

	 ThisKey() {
		System.out.println("thiskey");
		this.display();
		this.great(10, 20);
	}
	 void display(){
		System.out.println("display mesthod");
		
	}
	 void great(int a,int b) {
		 int c=a+b;
		 System.out.println(c);
	 }
	public static void main(String[] args) {
		ThisKey tb=new ThisKey();
		
	}
	
	
	
}
