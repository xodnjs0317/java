package day09;

public class Exercise01 {
	//Printer Class�� �ۼ��ϰ� Printer Class�� println() �޼ҵ带 ȣ���ؼ� �Ű����� 
	//�ֿܼ� ����Ϸ����մϴ�. println() �޼ҵ��� �Ű������δ� int, boolean, double,
	//String ���� �ټ��ֽ��ϴ�. Print Class���� println()�޼ҵ带 �����غ�����.
	
	public static void main(String[] args) {
		
		Printer2 printer = new Printer2();
		Printer printer1 = new Printer();
		
		int i = printer.println(10);
		printer1.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
		
	}
}
