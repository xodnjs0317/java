package day18;

public class A3 {
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
		
	}
	//static B field3 = new B(); //���� �ʵ�� �ν��Ͻ� Ŭ������ B�� ��� �Ҽ� �����ϴ�.
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B(); //B�� ���� Ŭ������ �ƴϰ� �ν��Ͻ� Ŭ�����̱� ������ ���� �޼ҵ忡�� ���Ұ�
		C var2 = new C();
	}
	
	class B{}
	
	static class C {}
	
}
