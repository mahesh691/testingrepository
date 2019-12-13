package com.Calender;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetest {

	
	public static void main(String[] args) {
		Date dat=new Date();
		System.out.println(dat.toString());
		
		SimpleDateFormat ft = 
			      new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

			      System.out.println("Current Date: " + ft.format(dat));
	}
}
