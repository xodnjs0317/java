package day11;

public class Calculator2Example {
	public static void main(String[] args) {
		
	
	Calculator2 myCalc = new Calculator2();
	
	
	
	//���簢���� ���� ���ϱ�
	double result1 = myCalc.areaRectangle(10);
	
	
	//���簢���� ���̱��ϱ�
	double result2 = myCalc.areaRectangle(10,20);
	
	
	//�����
	System.out.println("���簢���� ���� =" + result1);
	System.out.println("���簢���� ���� =" + result2);
	}
}
