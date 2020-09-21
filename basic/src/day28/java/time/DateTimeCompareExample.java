package day28.java.time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1,1,9,0,0);
		System.out.println("������ : "+ startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3,31,18,0,0);
		System.out.println("���� : "+ endDateTime+"\n");
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("���� ���Դϴ�."+"\n");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("�����մϴ�."+"\n");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("�����մϴ�.\n");
		}
		System.out.println("[������� ���� �ð�]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDays = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("���� �� : "+remainYear);
		System.out.println("���� �� : "+remainMonth);
		System.out.println("���� �� : "+remainDays);
		System.out.println("���� �ð� : "+remainHour);
		System.out.println("���� �� : "+remainMinute);
		System.out.println("���� ��  : "+remainSecond);
		System.out.println();
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDays = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("���� �� : "+remainYear);
		System.out.println("���� �� : "+remainMonth);
		System.out.println("���� �� : "+remainDays);
		System.out.println("���� �ð� : "+remainHour);
		System.out.println("���� �� : "+remainMinute);
		System.out.println("���� ��  : "+remainSecond);
		System.out.println();
		
		System.out.println("������� ���� �Ⱓ");
		Period period = Period.between(startDateTime.toLocalDate(),endDateTime.toLocalDate());
		System.out.println("���� �Ⱓ : "+ period.getYears()+"��");
		System.out.println(period.getMonths()+"��");
		System.out.println(period.getDays()+"��\n");
		
		//duration�� ��,��,�� �����ʵ��� ����ϴ� Ŭ�����Դϴ�.
		Duration duration = Duration.between(startDateTime.toLocalTime(),endDateTime.toLocalTime());
		System.out.println("������ �� " + duration.getSeconds());
		
		
	}
}
