package com.Mathematics;

import java.util.Scanner;

public class Leapyeartest {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter year: ");
	int a=scan.nextInt();
	
	if((a%400==0)||((a%4==0)&&(a%100!=0))) {
		System.out.println(a+" is leap year");
	}else {
		System.out.println(a+" is not leap year");
	}
}
}
