package day27.Calendar;

import java.util.Calendar;
import java.util.Date;

public class DateToCalendar {
	public static void main(String[] args) {
		
	
	Calendar c = Calendar.getInstance();
	
	Date d = new Date(c.getTimeInMillis());
	//Calendar 를 데이터로 변환
	
	Date d2 = new Date();
	
	System.out.println(d2);
	
	Calendar c2 = Calendar.getInstance();
	c2.setTime(d2);
	//Date 객체를 Calendar 객체로변환
	
			
	
}
}