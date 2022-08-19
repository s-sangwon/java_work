package com.week4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestWork1 {
	public static void main(String[] args ) {
		Calendar today = new GregorianCalendar();
		
		int y = today.get(Calendar.YEAR);
		int m = today.get(Calendar.MONTH)+1;
		int d = today.get(Calendar.DAY_OF_MONTH);
		int h = today.get(Calendar.HOUR);
		int mi = today.get(Calendar.MINUTE);
		int s = today.get(Calendar.SECOND);
		System.out.println(y+"년 " +m +"월 "+ d + "일 "+ h+"시 "+ mi+"분 "+ s+"초 " + today.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.KOREA) );
		
		
		
	}
}
