package day28.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜와 관련된 메소드는 localdate에도 있습니다.
		String strDateTime = now.getYear() +"년";
		strDateTime += now.getMonthValue()+"월";
	
		strDateTime += now.getDayOfMonth()+"일";
		
		strDateTime += now.getDayOfWeek()+"일";
		
		//시간에 관련된 메소드는 localtime에도 있습니다.
		strDateTime += now.getHour()+"일";
		
		strDateTime += now.getMinute()+"일";
		
		strDateTime += now.getSecond()+"일";
		
		strDateTime += now.getNano()+"일";
		
		System.out.println(strDateTime + "\n");
		
		//isLeapYear()은 LocalDate에만 있습니다. 그래서 LocalDate로 변환후에 사용
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년 : 2월은 29일까지 있습니다.");
		}else {
			System.out.println("올해는 평년 : 2월은 28일까지 있습니다.");
		}
		
		//협정 세계시와 존오프셋
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 :" + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 타임존 : "+ seoulDateTime);
		
		ZoneId seulZoneId = seoulDateTime.getZone();
		System.out.println("서울 존 아이디 : " +seulZoneId );
		
		ZoneOffset seulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울 존오프셋 : " + seulZoneOffset+"\n");
	}
	
}
