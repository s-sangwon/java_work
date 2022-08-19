package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	public long getDays() {
		long sumDays = 0L;
		Calendar today = new GregorianCalendar(); 
		//System.out.println(today.get(Calendar.DAY_OF_YEAR));
		for(int i=1; i<=2021; i++) {
			if(isLeapYear(i))
				sumDays += 366;
			else
				sumDays += 365;
		}
		return sumDays + today.get(Calendar.DAY_OF_YEAR);
	}
	
	public boolean isLeapYear(int y) {
		boolean r = false;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			r = true;
		return r;
	}
}
