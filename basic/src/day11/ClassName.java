package day11;

public class ClassName {
//인스턴스 필드와 메소드
	int field;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
}
	static {
		
		//field1 = 10; 인스턴스 필드나 메소드는 static 메소드에서 사용불가
		//method1();
		field2 = 10;
		method2();
	}
	static void method() {
		//this.field1 = 10; 인스턴스 필드나 메소드는 static 메소드에서 사용불가
		//this.method1();
		field2 = 10;
		method2();
	}
	
}
