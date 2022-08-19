package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowDate {

	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		//올해가 윤년인지? 평년인지? 출력 확인
		
		for(int i=4; i<=2022; i+=4)
			System.out.println(i+"년은 "+(totalDay.isLeapYear(i) == true? "윤년" : "평년"));
		System.out.println((totalDay.isLeapYear(2022) == true? "윤년" : "평년"));
		//1년 1월 1일부터 오늘까지의 총 날수 계산 출력
		
		long total = totalDay.getDays();
		System.out.println(("총날짜수 : " + total));
		
	}

}
