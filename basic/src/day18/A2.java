package day18;

public class A2 {
	A2() {System.out.println("A2��ü�� ����");}
	
	//�ν��Ͻ� ��� Ŭ����
	class B {
		B() {System.out.println("B��ü�� ����");}
		int field1;
		void method1() {}
	}

	static class C{
		C() {System.out.println("C��ü�� ����");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		class D{
			D() {System.out.println("D��ü�� ����");}
			int field1;
			//static int field2; //���� Ŭ������ static ���Ұ�
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}

