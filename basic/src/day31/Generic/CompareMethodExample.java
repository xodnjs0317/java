package day31.Generic;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String>p1 = new Pair<Integer, String>(1,"���");
		Pair<Integer, String>p2 = new Pair<Integer, String>(1,"���");
		boolean result1  = Util2.compare(p1, p2);
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
		Pair<String, String>p3 = new Pair<String, String>("user1","���");
		Pair<String, String>p4 = new Pair<String, String>("user2","���");
		boolean result2  = Util2.<String,String>compare(p3, p4);
		if(result2) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� �ʴ� ��ü�Դϴ�.");
		}
		
	}
}
