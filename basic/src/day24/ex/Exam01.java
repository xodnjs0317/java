package day24.ex;

public class Exam01 {
	public static void main(String[] args) {
		
		Exam01 ex01 = new Exam01();
		
		long number = 228754462;
		
		System.out.println("�Է¼��� ="+number);
		
		System.out.println("2Ƚ��=>"+ex01.countNumber(number,2)); //3������
		
		System.out.println("4ȸ��=>"+ex01.countNumber(number,4)); //2������
	}
	
	
		public int countNumber(long number, int i) {
	
			String str1 = String.valueOf(i);
			String str2 = String.valueOf(number);
			
			int o =0;

			for(int a=0;a<str2.length();a++) {
				char ch = str2.charAt(a);
			String s = String.valueOf(ch);	
				if(str1.equals(s) ) {
					o++;
				} 
			}
			return o;
					}
		
}	
	

