package day09;

public class Exercise01 {
	//Printer Class를 작성하고 Printer Class에 println() 메소드를 호출해서 매개값을 
	//콘솔에 출력하려고합니다. println() 메소드의 매개값으로는 int, boolean, double,
	//String 값을 줄수있습니다. Print Class에서 println()메소드를 선언해보세요.
	
	public static void main(String[] args) {
		
		Printer2 printer = new Printer2();
		Printer printer1 = new Printer();
		
		int i = printer.println(10);
		printer1.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}
}
