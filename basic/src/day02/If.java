package day02;

public class If {
	
	public static void main(String[] args) {
		int v1 = 2;
		
		//if �Լ��� ()���� �ȿ� ���� ���϶� ����Ǵ� �޼ҵ�
		//�̴�.
		//���ٶ�� ����� ���鶧�� x == y �������� ��밡��
		if(v1>10) 
		{			
			v1 = 0;
			System.out.println("�����϶� ����");
		}
		//else�� ���� if �Լ� ���� ���� ���� ������ ��
		//����Ǵ� �޼ҵ��Դϴ�.
		else {
			System.out.println("�����϶� ����");
		}
		//���� else�� ���ٸ� ������ �� ����Ǵ� �޼ҵ�� 
		//�����ϴ�.
		System.out.println("������ ����");
		System.out.println(v1);
		
	}

}
