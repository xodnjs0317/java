package day28.java.time;

import java.time.LocalDateTime;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시 : " + now);
		
		//LocalDateTime targetDateTime = now.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).minusMinutes(5).plusSeconds(6);
		//System.out.println("연산 후 : "+ targetDateTime);
		
		
		LocalDateTime targetDateTime2 = now.plusYears(1).minusMonths(10).plusDays(3).plusHours(4).minusMinutes(5).plusSeconds(6);
		System.out.println("연산 후 : "+ targetDateTime2);
	}
}
