package com.Set1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FindDay {

	public static String getDay(Date d1) {
		String s1;
		SimpleDateFormat sdf=new SimpleDateFormat();
	 s1	=sdf.format(d1);
	return s1;
	}
	
	public static void main(String[] args) {
		Date d1=new  Date(2019, 2, 12);
		System.out.println("day is:"+getDay(d1));
	
	}

}
