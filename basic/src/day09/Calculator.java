package day09;

public class Calculator {
	//�޼ҵ��� �̸� ��Ģ
	//���ڷ� �����ϸ� �ȵǰ�, $��_�� ������ Ư�� ���ڸ� ������� ���ƾ��Ѵ�.
	// ���������� �޼ҵ���� �ҹ��ڷ� �ۼ��Ѵ�.
	// ���� �ٸ� �ܾ ȥ�յ� �̸��̶�� ���̾� ���� �ܾ��� ù�Ӹ� ���ڴ� �빮�ڷ� �ۼ��Ѵ�.
	//startEngine
	void powerOn() {
		System.out.println("������ �մϴ�.");
		
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
