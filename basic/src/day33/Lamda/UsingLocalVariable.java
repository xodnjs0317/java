package day33.Lamda;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		MyFunctionalInterface fi =() ->{
			System.out.println("arg " + arg);
			System.out.println("localVar : "+localVar+"\n");
		};
		//메소드 내부에 있는 람다식이 메소드의 필드를 참조할때는 메소드 종류 후에 필드가 사라져서
		//엉뚱한 값을 참조하지 않게 하기 위해 final 특성을 가집니다.
		
		fi.method();
	}
}
