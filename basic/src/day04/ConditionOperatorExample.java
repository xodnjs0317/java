package day04;

public class ConditionOperatorExample {
	public static void main(String[] args) {
		
		int score = 85;
		char grade = (score >90) ? 'A': 'F'; // ? ��:���� ������ ������� �� ������ ��
		
		System.out.println(score + "����"+grade+""+"����Դϴ�.");
		
		
		char grade2 = (score >90) ? 'A': (score>80) ? 'B' : 'C';
		
		System.out.println(score + "����"+grade2+""+"����Դϴ�.");
	}
}
