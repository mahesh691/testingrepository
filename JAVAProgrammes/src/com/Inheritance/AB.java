package com.Inheritance;

import java.util.Scanner;

class cd{
	public void add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value : ");
		int a=scan.nextInt();
		System.out.println("enter b value : ");
		int b=scan.nextInt();
		System.out.println("addition of a and b :"+ (a+b));
	}
	
}
public class AB extends cd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AB obj =new AB();
obj.add();
	}

}
