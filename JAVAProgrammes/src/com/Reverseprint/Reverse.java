package com.Reverseprint;

import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		
		StringBuffer sb1=sb.append("verry good");
		System.out.println(sb1);
		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());
		System.out.println(str.equalsIgnoreCase("Mahesh"));

		StringBuffer sb2 = new StringBuffer("testing");
		StringBuffer sb3= sb2.append(" engineer");
		System.out.println(sb3);
		System.out.println(sb2);
		System.out.println(str.substring(4));//without before 4 letters remaining dispaly
		System.out.println(str.charAt(0));//first letter print
		System.out.println(str.lastIndexOf('h'));//know the indexnumber of letter
		System.out.println(str.substring(2, 5));
		System.out.println(str.indexOf("h"));
		
		System.out.println(str.substring(3));
		System.out.println(str.replace('m', 'r'));
		
		
		}
}