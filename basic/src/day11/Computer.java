package day11;

public class Computer {
	//�Ű������� �迭�� �����ϰ� �Ǹ� �迭�� �޾Ƽ� �迭�� ���ڸ�ŭ �Ű������� ������ �ֽ��ϴ�.
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i <values.length; i++) {
			sum += values[i];
			
		}
		return sum;
	}
	//�Ű�������...�� ���̰� �Ǹ� �������� ������ ������ ��� �ڵ����� �迭�� ������ݴϴ�.
	int sum2(int...values) {
		int sum = 0;
		for(int i=0; i<values.length;i++) {
			sum += values[i]; 
		}
		return sum;
	}
}
