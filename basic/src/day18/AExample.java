package day18;

public class AExample {
	public static void main(String[] args) {
		A.C c = new A.C();
		
			c.field1 = 3;
			
			c.method1();
			
			A.C.field2=3;
			
			A.C.method2();
			
			A.i = 1;
			A.method3();
		
}
}
