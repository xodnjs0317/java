package day03;

public class CheckOverflowExample03 {
	public static void main(String[] args) {
		long left = 1000000000;
		long right = 1000000000;
		
		long sub = left -right; 
		
		
		if (sub>Integer.MAX_VALUE);
		System.out.println("�����÷ο� �ʰ�"); 
		 
		
		if (sub<Integer.MIN_VALUE);
		System.out.println("�����÷ο� �̸�");
		
		System.out.println(sub);
		
			
		
		
	}
	
}
