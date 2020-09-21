package day24;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		
		String upperStr1 = str1.toUpperCase();
		//touppercase()는 문자열을 모두 대문자로 바꿔서 리턴하는 매소드입니다.
		String upperStr2 = str2.toUpperCase();
		
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsignorecase()는 대소문자 구분없이 서로 같은문장이면 true를 반환하는 메소드입니다.
	}
}
