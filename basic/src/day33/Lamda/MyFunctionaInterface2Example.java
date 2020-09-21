package day33.Lamda;

public class MyFunctionaInterface2Example {
	public static void main(String[] args) {
		MyFunctionaInterface2 fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(2);
		
		fi = x->System.out.println(x*5);
		fi.method(2);
	}
}
