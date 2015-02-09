package com.java.spring.angular.model;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {
	private Date birthDay;
	private static final Date DATE_START;
	private static final Date DATE_END;
	
	static{
		Calendar gtmCal = Calendar.getInstance(TimeZone.getTimeZone("GTM"));
		gtmCal.set(1990,Calendar.NOVEMBER,30);
		DATE_START = gtmCal.getTime();
		gtmCal.set(2000, Calendar.NOVEMBER, 30);
		DATE_END = gtmCal.getTime();
	}
	
}
