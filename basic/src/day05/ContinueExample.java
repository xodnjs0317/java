package day05;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0) { //i�� 2�� �������� �������� 0�̾ƴҶ� Ȧ���� �����ǰ� 2�ǹ����
			continue;
			}
			System.out.println(i);
		}
		
	}
}
 