package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();//현재시간
		//int h = calendar.get(Calendar.HOUR_OF_DAY);
		long l1 = calendar.getTimeInMillis();
		
		System.out.println(l1);
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.HOUR_OF_DAY, 50);
		long l2 = calendar2.getTimeInMillis();
		//int h2 = calendar2.get(Calendar.HOUR_OF_DAY);//5시간 뒤
		
		//System.out.println(h2-h);
		System.out.println(l2);
		System.out.println(l2-l1);
		long l3 = l2 - l1;
		System.out.println(l3/1000); //초단위
		System.out.println(l3/1000/60); //분단위
		System.out.println(l3/1000/60/60); //시간단위
		System.out.println(l3/86400000 +"일"+(l3/3600000)%24 +"시간");
	}
}
