package com.Practice;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		for(int i=0;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int x=5;x>0;x--) {
			for(int y=0;y<x;y++) {
				System.out.print(x);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt(); 
		System.out.print("Enter Symbol : ");
		 
		char c = sc.next().charAt(0);
		 
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
		 
			{
					System.out.print(" ");
			}
		 
		for(int j=1;j<=i*2-1;j++){
			System.out.print(c);
		}
			System.out.println(); 
		} 
		for(int i=n-1;i>0;i--)
	{
		for(int j=1;j<=n-i;j++)
		 
		{
		System.out.print(" ");
		}
		
		for(int j=1;j<=i*2-1;j++)
		 
			{
			System.out.print(c);
			}
			System.out.println();
	}
		 
		}
			
	}
