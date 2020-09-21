package day18;

public class A3 {
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
		
	}
	//static B field3 = new B(); //정적 필드로 인스턴스 클래스인 B는 사용 할수 없습니다.
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B(); //B는 정적 클래스가 아니고 인스턴스 클래스이기 때문에 정적 메소드에서 사용불가
		C var2 = new C();
	}
	
	class B{}
	
	static class C {}
	
}
