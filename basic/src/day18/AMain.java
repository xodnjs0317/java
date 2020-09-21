package day18;

public class AMain {
	public static void main(String[] args) {
		A2 a = new A2();
		
		//인스턴스 멤버 클래스 객체 생성
		A2.B b = a.new B();
		b.field1 =3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A2.C.field2 = 3;
		A2.C.method2();
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
	}
}
