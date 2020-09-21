package day27.Calendar;

import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
	Calendar today = Calendar.getInstance();
	//�⺻������ ���� ��¥�� �ð����� �����˴ϴ�.
	System.out.println("�� ���� �⵵ :" + today.get(Calendar.YEAR));
	System.out.println("��(0~11, 0 =1��)  :" + today.get(Calendar.MONTH));
	System.out.println("�� ���� ��° �� : "+ today.get(Calendar.WEEK_OF_YEAR));
	System.out.println("�� ���� ��° �� :" + today.get(Calendar.WEEK_OF_MONTH));
	
	System.out.println("�� ���� �� �� : " + today.get(Calendar.DATE));
	System.out.println("�� ���� �� �� : " + today.get(Calendar.DAY_OF_MONTH));
	//date�� day of month �� ���� ����.
	System.out.println("�� ���� �� �� : " + today.get(Calendar.DAY_OF_YEAR));
	System.out.println("����(1~7, 1: �Ͽ��� : )"+ today.get(Calendar.DAY_OF_WEEK));
	System.out.println("�� ���� ��° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println("����_����(0 : ����, 1: ����) : " +today.get(Calendar.AM_PM));
	System.out.println("�ð� (0~11) : " +today.get(Calendar.HOUR));
	System.out.println("�ð�(0~23) : " +today.get(Calendar.HOUR_OF_DAY));
	System.out.println("��(0~59) : " +today.get(Calendar.MINUTE));
	System.out.println("��(0~59) : " +today.get(Calendar.SECOND));
	System.out.println("1000���� 1��(0~999) : "+ today.get(Calendar.MILLISECOND));
	System.out.println("TimeZone (-12~+12) :"+ today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
	//�и� ������ ������ �ð����� ǥ���ϱ� ���� 36000000 ���������ϴ�.
	System.out.println("�� ���� ������ �� : "+today.getActualMaximum(Calendar.DATE));
}
}
