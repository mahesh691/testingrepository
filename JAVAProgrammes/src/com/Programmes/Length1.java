package com.Programmes;

public class Length1 {
	
	public static void main(String[] args) {
		
		String m1="mahesh";
		String m2="manoj";
	
	int	mahesh=m1.length();
	int manoj=m2.length();
	
	if(mahesh==manoj)
	{
		System.out.println("both srings are equal");
	}else 
		if(mahesh>manoj) {
			System.out.println("mahesh is greater than manoj");
		}
		else
		{
			System.out.println("mahesh is less than manoj");
		}
		
	}
	
}
