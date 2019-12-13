package com.Programmes;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int[2][2];
		array1[0][0]=123;
		array1[0][1]=234;
		array1[1][0]=456;
		array1[1][1]=567;
		
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++)
			{
				
		System.out.print(array1[i][j]+" ");
		
			}System.out.println();
		
		}
		
		System.out.println("*******************");
		String array2[][]=new String[2][2];
		array2[0][0]="i am";
		array2[0][1]="good";
		array2[1][0]="you are";
		array2[1][1]="bad";
		
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++)
			{
				
		System.out.print(array2[i][j]+" ");
		
			}System.out.println();
		
		}
		
		
		
	}
	
}
