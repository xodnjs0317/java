package day11;

public class ClassName {
//�ν��Ͻ� �ʵ�� �޼ҵ�
	int field;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
}
	static {
		
		//field1 = 10; �ν��Ͻ� �ʵ峪 �޼ҵ�� static �޼ҵ忡�� ���Ұ�
		//method1();
		field2 = 10;
		method2();
	}
	static void method() {
		//this.field1 = 10; �ν��Ͻ� �ʵ峪 �޼ҵ�� static �޼ҵ忡�� ���Ұ�
		//this.method1();
		field2 = 10;
		method2();
	}
	
}
