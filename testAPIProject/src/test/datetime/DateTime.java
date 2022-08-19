package test.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
	public DateTime() {
	}
	
	public void usingDate() {
		Date today = new Date();
		//오늘 날짜화 현재 시간으로 기본 생성됨
		Date whenDay = new Date(1000000L);
		//1970년1월 1일 목요일 0시 0분 0초 부터 일백만초가 지난
		//날짜와 시간을 의미함
		System.out.println(today);
		System.out.println(whenDay);
	}
	
	public void usingCalendar() {
		
		
		Calendar today = Calendar.getInstance();
		Date when = today.getTime();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		int ampm = today.get(Calendar.AM_PM);
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "오전" : "오후";

		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초", year, month, date, sAmPm, hour, min, sec);
	}
	
	public void usingCalendar2() {
		GregorianCalendar today = new GregorianCalendar();
		Calendar current = new GregorianCalendar();
		Calendar when = new GregorianCalendar(2000, 8, 8);
		
		System.out.println(today);
		System.out.println(current);
		System.out.println(when);
	}
	
	public void printFormatter() {
		//formatter 이용한 출력
		char ch = 'B';
		String str = "java formatter";
		int num = 12345;
		double dnum = 753.12;
		
		System.out.printf("c : %c, str : %s\n", ch, str);
		//출력문자에 사용된 포매터와 적용할 값은 자료형과 순서가 일치
		System.out.printf("num : %d, %o, %x \n", num, num, num);
		System.out.printf("dnum : %f, %g, %e, %A, \n", dnum, dnum, dnum, dnum);
		
		Calendar today = new GregorianCalendar();
		String pattern = "yy-MM-dd E a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String result = sdf.format(today.getTime());
		System.out.println(result);
		
		//포맷 자릿수 지정
		String name = "김철수";
		int age = 27;
		double height = 178.5;
				
		System.out.printf("|%-10s|%10d|%10.2f|\n", name, age, height);
		
	}
}	
