package com.Programmes;

public class EqualStrings {

	public static void main(String[] args) {
		System.out.println("\n#################\n");	
		
			String m1="mani";
			String m2="mani";
			if(m1.equals(m2))
			{
				System.out.println("both are equal");
			}else
				
			{
				System.out.println("not equal");
			}
		System.out.println("\n#################\n");	
			
			String m3="Mani ";
			String m4="mani";
			if(m3.equalsIgnoreCase(m4))
			{
				System.out.println("both are equal");
			}else
			{
				System.out.println("not equal");
			}
			
System.out.println("\n#################\n");	
			
			String m5="mani";
			String m6="manikanta";
			if(m6.contains(m5))
			{
				System.out.println("yes");
			}else
			{
				System.out.println("no");
			}
			
			
	}

}
