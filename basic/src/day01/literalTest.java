package day01;

public class literalTest {
	public static void main(String[] args) {
		//���� ���ͷ�
		
		//0, 75 ,-100 �Ҽ����� ���� ���� ���ͷ�
		//byte , char, short, int, long �� ������ �˴ϴ�.
		byte b = 0;
		System.out.println(b);
		//0���� �����ϴ� ���ͷ��� 8������ �����Ѵ�.
		//02, -04
		byte b2 = 02;
		System.out.println(b2);
		//0x �Ǵ� 0X�� �����ϰ� 0~9 A,B,C,D,E,F �� ������ 
		//���ͷ��� 16������ �����Ѵ�.
		int i = 0x5;
		System.out.println(i);
		
		
		//�Ǽ� ���ͷ�
		float f = 0.25f;
		double d = -3.14;
		System.out.println(f);
		System.out.println(d);
		
		double d2= 2E3;
		double d3 = 2E-10;
		System.out.println(d2);
		System.out.println(d3);

		
		//���� ���ͷ�
		//(') ���� ����ǥ�� ���� �ؽ�Ʈ�� �ϳ��� ���� 
		//���ͷ��� ���� �Ѵ�.
		char c = 'A';
		char c2 = '��';
		char c3 = '\t';
		char c4 = '\n';
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		// \t = ���� ��, \n = �ٹٲ�, \" = ū����ǥ
		// \' = ���� ����ǥ , \\ = \ , \\u16���� = 16����
		
		//���ڿ� ���ͷ�
		//ū����ǥ "�� ���� �ؽ�Ʈ�� ���ڿ� ���ͷ��� ���� �Ѵ�.
		//ū����ǥ �ȿ��� �ؽ�Ʈ�� ��� ���ڿ� ���ͷ��� ����
		//���ڿ� ���ͷ� ���ο����� �̽������� ���ڸ� ��� �����ϴ�.
		
		String s = "���ѹα�";
		String s2 = "�Ǹ�ŭ �̵� \t �մϴ�.";
		String s3 = "���� �������� \n �մϴ�.";
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		
		//�� ���ͷ�
		//true�� false�� �� ���ͷ��� �����Ѵ�.
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);

		
		
		
		
		
		
				
		
		
		
		
	}

}
