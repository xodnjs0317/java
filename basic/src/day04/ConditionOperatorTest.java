package day04;

public class ConditionOperatorTest {
	public static void main(String[] args) {
		//���� �����ڸ� ����ؼ� 90�� �̻��̸� A���
		//80�� �̻��̸� B��� 70���̻��̸� C��� �������� F�� ���α׷��� ���弼��.
		
		int score = 30;
		
		char grade = (score>=90) ? 'A' : (score>=80) ? 'B' : (score>=70) ? 'C' : 'F';
		
		System.out.println(score + ""+ "����" + grade + "����Դϴ�.");
	
		
	
		
	}
}
