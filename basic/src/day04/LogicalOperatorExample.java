package day04;

public class LogicalOperatorExample {
	public static void main(String [] args) {
		int charCode = '1';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("�빮���̱���?");
		}
		if((charCode>=97) & (charCode<=122)) {
			System.out.println("�ҹ����̱���?");
		}
		if((charCode>48) && !(charCode>57)) {
			System.out.println("0-9���ڱ���?");
			
		}
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2�Ǵ�3�ǹ��");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2�Ǵ�3�ǹ��");
	}
		}	
		}		

