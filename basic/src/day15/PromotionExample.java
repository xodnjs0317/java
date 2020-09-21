package day15;

class A {}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}



public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//B b1 = e; B와 E는 상속 관계에 있지 않기 때문에 자동변환이 불가능합니다. 
		//C c1 = d;
		
		
		
	}
}
