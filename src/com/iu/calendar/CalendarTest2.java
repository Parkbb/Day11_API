package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		calendar.set(Calendar.YEAR, 2020);
		
		year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		calendar.set(Calendar.MONTH, 10);
		int mon = calendar.get(Calendar.MONTH);
		
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}
}
