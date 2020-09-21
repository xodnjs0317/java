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
			 class D{ //메소드 안에 클래스를 만들 수 있는데 이것을 로컬 클래스라고 부릅니다.
				 D() {} //생성자
				 int field1; //이스턴스필드
				 void method1() {}
				 //static int field2; 정적필ㄹ드는 사용할수 없다
				 //static void method2() {}
			 }
			 D d = new D();
			 d.field1 = 3;
			 d.method1();
					
				
}
}
