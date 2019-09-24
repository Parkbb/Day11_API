package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//택배,,
		//현재의 년월일
		
		int year = calendar.get(Calendar.YEAR);
		int mon = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(mon);
		System.out.println(day);
		
		//이틀뒤의 년월일
		//calendar.set(Calendar.DATE, day+10);
		//calendar.roll(Calendar.DATE, 10);
		calendar.add(Calendar.DATE, 10);
		day = calendar.get(Calendar.DATE);
		System.out.println(year);
		mon = calendar.get(Calendar.MONTH)+1;
		System.out.println(mon);
		System.out.println(day);
		
	}

}
