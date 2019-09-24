package com.iu.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//현재 시간의 정보
		Calendar cal = Calendar.getInstance(); //new GregorianCalendar()
		//get
		int hour = cal.get(Calendar.HOUR); //12시간제
		hour = cal.get(Calendar.HOUR_OF_DAY); //24시간제
		int min = cal.get(Calendar.MINUTE);
		//연도
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH); //1월 0, 2월 1,
		int day = cal.get(Calendar.DATE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(year+"년");
		System.out.println(mon+1+"월");
		System.out.println(day+"일");
		System.out.println(hour+"시");
		System.out.println(min+"분");
		System.out.println(sec+"초");


	}

}
