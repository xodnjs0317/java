package day18;

public class A2 {
	A2() {System.out.println("A2객체가 생성");}
	
	//인스턴스 멤버 클래스
	class B {
		B() {System.out.println("B객체가 생성");}
		int field1;
		void method1() {}
	}

	static class C{
		C() {System.out.println("C객체가 생성");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		class D{
			D() {System.out.println("D객체가 생성");}
			int field1;
			//static int field2; //로컬 클래스는 static 사용불가
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}

