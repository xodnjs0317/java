package day24.ex;

public class Exam01 {
	public static void main(String[] args) {
		
		Exam01 ex01 = new Exam01();
		
		long number = 228754462;
		
		System.out.println("입력숫자 ="+number);
		
		System.out.println("2횟수=>"+ex01.countNumber(number,2)); //3을리턴
		
		System.out.println("4회수=>"+ex01.countNumber(number,4)); //2를리턴
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
	

