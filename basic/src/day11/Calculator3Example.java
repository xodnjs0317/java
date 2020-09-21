package day11;

public class Calculator3Example {
	public static void main(String[] args) {
		double result1 = 10*10*Calculator3.pi;
		
		int result2 = Calculator3.plus(10, 5);
		int result3 = Calculator3.minus(10, 5);
		
		System.out.println("result :"+result1);
		System.out.println("result :"+result2);
		System.out.println("result :"+result3);
	}
}
