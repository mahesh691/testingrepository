package com.SushanthTest;

public class Constructor {

	int i;
	Constructor(){
		System.out.println(i);
	}
	
	void display(){
		System.out.println("display method"+i);
	}
	
	public static void main(String[] args) {
		Constructor c=new Constructor();
		c.display();
	}
}
