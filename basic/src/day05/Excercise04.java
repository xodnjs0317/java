package day05;

public class Excercise04 {
	public static void main(String[] args) {
		//while ���� Math.random() �޼ҵ带 �̿��ؼ� �ΰ���
		//�ֻ����� �������� ������ ���� (��1,��2) ���·� ����ϰ�,
		//���� ���� 5�� �ƴϸ� �ֻ����� ��� ������, ���� ���� 5�̸� ������ ���ߴ�
		//�ڵ带 �ۼ��غ�����.
		int num1 = 0;
		int num2 = 0;
		int sum= 0;
		
		while(true) {
			if(sum != 5) {
				num1 = (int)(Math.random()*6)+1;
				num2 = (int)(Math.random()*6)+1;
				System.out.println(num1+","+num2);
				sum = (num1+num2);
				
			} else
			break;
	
	}	System.out.println("���α׷�����");
			

			
}
}


		
	


