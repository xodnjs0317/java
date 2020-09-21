package day25;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		//02또는 010 포함
		//3자리 혹이 4자리숫자
		//\ㅇ{4} 4자리숫자
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else { 
			System.out.println("정규식과 일치하지 않습니다.");
		}
		//\w 한개이상의 알파벳 또는 숫자
		//+(\\.\\w+)가 없거나 한번더 올수있음
		
		
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
				result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지않습니다.");
		}
	}
}
