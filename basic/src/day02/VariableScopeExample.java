package day02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 9;
		
		
		//if �Լ��� ()���� �ȿ� ���� ���϶� ����Ǵ� �޼ҵ�
		//�̴�.
		if(v1>10) {
			int v2 = v1 -10;
			
		}
		//int v2�� if ���ȿ����� ��� ���� �ϱ� ������ 
		// ���� ����� �ٽ� ���� ����
		int v2 = 2;
		int v3 = v1 + v2 + 5;
		
	}
}
