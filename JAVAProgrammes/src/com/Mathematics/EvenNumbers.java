package com.Mathematics;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number : ");
		int a=scan.nextInt();
		System.out.println("even numbers between 1 to "+a);
		
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
