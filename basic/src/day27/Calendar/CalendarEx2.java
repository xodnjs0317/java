package day27.Calendar;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","��","ȭ","��","��","��","��","��"};
		//ù��° �迭�� ����ִ� ������ ������ 1���� �����ϱ� �����Դϴ�.
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		date1.set(2015, 7, 15);
		//2015�� 8 �� 15�Ϸ� ����
		
		System.out.println("date1�� " + toString(date1)+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�,");
		
		System.out.println("����(date2)��" + toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+ "���� �Դϴ�.");
		
		//�� ��¥���� ���̸� ��������, getTimeMillis() õ���� ���� ������ ��ȯ�ؾ� �մϴ�.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("�׳� (date1)���� ����(date2)����"+ difference + "�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ�"+ difference/(24*60*60)+"�� �Դϴ�."); //1�� = 24*60*60
		
		}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+ (date.get(Calendar.MONTH)+1) +"��"+ date.get(Calendar.DATE)+ "��";
	}
}
