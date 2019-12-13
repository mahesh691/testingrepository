package com.Programmes;

public class Factorial {

	public static long factorials(int i)
	{
//		i!=i*(i-1)*.i...i.*3*2*1
//		5!=5*4*3*2*1
		
		if(i<=1) {
			return 1;
		}else {
			return (i*factorials(i-1));
	}
		
	}
	public static void main(String[] args) {
		
		System.out.println(factorials(10));
	
	}

}
