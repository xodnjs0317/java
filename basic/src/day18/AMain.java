package day18;

public class AMain {
	public static void main(String[] args) {
		A2 a = new A2();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A2.B b = a.new B();
		b.field1 =3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A2.C.field2 = 3;
		A2.C.method2();
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
		
	}
}
