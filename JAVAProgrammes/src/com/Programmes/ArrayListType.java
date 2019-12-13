package com.Programmes;



import java.util.ArrayList;
import java.util.List;

public class ArrayListType {

	public static void main(String[] args) {
		
		List<Object>array2=new ArrayList<>();
		
		array2.add("selenium");
		array2.add(10);
		array2.add("mahesh");
		array2.add(10.2341);
		
		
		for(int i=0;i<array2.size();i++)
		{
			
				
		System.out.println(array2.get(i));
		
			
		}System.out.println();
		
		System.out.println("*******************");
	
	}
}
