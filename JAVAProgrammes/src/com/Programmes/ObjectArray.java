package com.Programmes;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object array1[][]=new Object[2][2];
		array1[0][0]="mahesh";
		array1[0][1]=234;
		array1[1][0]="sravan";
		array1[1][1]=567;
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				
		System.out.print(array1[i][j]+" ");
		
			}System.out.println();
		
		}
		
		System.out.println("*******************");
		
		
		Object array2[][]=new Object[2][2];
		array2[0][0]="mahesh";
		array2[0][1]=234;
		array2[1][0]="sravan";
		array2[1][1]=56.7;
		array2[1][2]=567;//forceble integer error
		
		for(int i=0;i<array2.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				
		System.out.print(array2[i][j]+" ");
		
			}System.out.println();
		
		}
		
		System.out.println("*******************");
		
	}

}
