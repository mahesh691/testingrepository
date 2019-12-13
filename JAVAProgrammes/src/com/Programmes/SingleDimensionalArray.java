package com.Programmes;



public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array1[]=new int[3];
		Array1[0]=10;
		Array1[1]=20;
		//store the similar data type 
		//size of the array fixed
		//memory is wasting when we are not assigning in memory location
		//it showing is zero 
		
		for(int i=0; i<3;i++)
		{
			System.out.println(Array1[i]);
		}
		
	System.out.println("#############");
	
	int Array2[]=new int[3];
	Array2[0]=10;
	Array2[1]=20;
	Array2[2]=30;
	//store the similar data type 
	//size of the array fixed
	//memory is wasting when we are not assigning in memory location
	//it showing is zero 
	
	for(int i=0; i<3;i++)
	{
		System.out.println(Array2[i]);
	}
	
System.out.println("#############");

String Array3[]=new String[3];
Array3[0]="abc";
Array3[1]="cdef";
Array3[2]="dse";
//store the similar data type 
//size of the array fixed
//memory is wasting when we are not assigning in memory location
//it showing is zero 

for(int i=0; i<Array3.length;i++)
{
	System.out.println(Array3[i]);
}

System.out.println("#############");
	
	

	}

}
