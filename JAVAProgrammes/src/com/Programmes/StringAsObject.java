package com.Programmes;

public class StringAsObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String mytool = "selenium"; //string variable
String [] mytools = {"uft", "selenium","rft"}; //array of strings 
System.out.println(mytool);// only seleniuum print 

	for(String Tools:mytools) {
		System.out.println(Tools);
	}
System.out.println("**************concatenating string*****************2");
	
String str1="mahesh";
String str2="chindam";

System.out.println(str1+str2);
System.out.println(1+1+str1);
System.out.println(str1+1+1);
System.out.println(1+str1+1+1);
	

System.out.println("************** string comparison *****************2");

//ansi character code
//A to Z to ( 65 to 90)
//a to z (97 to 122)
// 0 to 9 (48 to 57)

//if s1==s2  then 0
//if s1>s2 then positive
//if s1<s2 then negative

String st1="mahesh";
String st2="MAHESH";
String st3="mahesh";
String st4="maahesh";

System.out.println(st1==st2);
System.out.println(st1==st3);
System.out.println(st1.equals(st2));
System.out.println(str1.equals(st3));
System.out.println(st1.compareTo(st3));
System.out.println(st2.compareTo(st1));
System.out.println(st1.compareTo(st4));	
	}
}