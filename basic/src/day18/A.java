package day18;

public class A {
		static class C{
			C(){};
			
			int field1;
			static int field2;
			void method1() {}
			static void method2() {}
		}
		
			static int i = 0;
			 static void method3() {
			 class D{ //�޼ҵ� �ȿ� Ŭ������ ���� �� �ִµ� �̰��� ���� Ŭ������� �θ��ϴ�.
				 D() {} //������
				 int field1; //�̽��Ͻ��ʵ�
				 void method1() {}
				 //static int field2; �����ʤ���� ����Ҽ� ����
				 //static void method2() {}
			 }
			 D d = new D();
			 d.field1 = 3;
			 d.method1();
					
				
}
}
