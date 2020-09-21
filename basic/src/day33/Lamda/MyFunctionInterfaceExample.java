package day33.Lamda;

public class MyFunctionInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
		
		//실행문이 한개라면 중괄호 생략가능
		if(true) System.out.println("진실");
	}
}

//	Runnable fi = new Runnable() {
//	public void run() {...};
//	람다식과 같은 기능을 하는 기존의 익명 구현객체
//	Runnable runnable = () -> {...};
//	}
