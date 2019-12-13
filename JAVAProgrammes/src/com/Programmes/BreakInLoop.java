package com.Programmes;

public class BreakInLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=10;x++)
		{
			if(x==6) {
				System.out.println(x);
				continue;
				//skip that x==6 and continue till condition
			}
			System.out.println("i am "+ x);
	
		}
		
		System.out.println("\n****************\n");
		for(int x=1;x<=10;x++)
		{
			if(x==6) {
				break;//stop execute when x==6 
			}
			System.out.println("i am "+ x);
		}
		
		System.out.println("\n****************\n");
		
		for(int y=1;y<=5;y++)
		{
			if(y==2) {
				System.out.println(y);
				continue;
			}
			System.out.println("i am "+ y);
			
				//only one time printout

		}
	}

}
