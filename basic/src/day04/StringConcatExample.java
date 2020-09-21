package day04;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 ="뭐든지 쓸수 있음 6.06.4.56" + "6.0";
		String str2 = str1 + "특징";
		
		System.out.println(str2);
		
		String str3 = "JDK" +3 + 3.0;
		String str4 = 3+ 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		//str4 연산의 순서때문 double로 변환해서 3.0+3.0 = 6.0 이됨
	}
}
