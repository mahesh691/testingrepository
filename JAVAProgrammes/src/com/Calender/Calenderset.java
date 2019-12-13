package com.Calender;

import java.util.Calendar;

public class Calenderset {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int dd=cal.get(Calendar.DATE);	
		int mm=cal.get(Calendar.MONTH);
		int yy=cal.get(Calendar.YEAR);
		mm++;
		System.out.println(dd+"-"+mm+"-"+yy);
		
		int h=cal.get(Calendar.HOUR);
		int m=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);
		
		System.out.println(h+"-"+m+"-"+s);
		
		int x=cal.get(Calendar.AM_PM);
		if(x==0) {
			System.out.println("good morning");
		}else if(x==0 && x>h) {
			System.out.println("good Afternoon");
		}
		else
		{
			System.out.println("good Night");
		}
		
	}
	
	
	
}
