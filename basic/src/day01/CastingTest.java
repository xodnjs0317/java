package day01;

public class CastingTest {
	public static void main(String[] args) {
		int i = 127;
		byte b = 100;
		float f = 1.1f;
		
		double d = f;
		
		float f1 = (float)d;
		
		int i2 = b; //������ �Ǵ� ��ĳ�����̶�� �Ѵ�.
		
		byte c = (byte)i;// ���� ���� ū ���� ��´�. 
		//�ٿ� ĳ���� ����ȯ ������ �� �ս��� �߻� �Ҽ� �ֽ��ϴ�.
		
		System.out.println(c);
		
		
	}

}
