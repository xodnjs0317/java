package day26.ex;

import java.util.regex.Pattern;

//첫번째는 알파벳으로 시작하고 두번째부터 숫자와 알파벳으로 구성된 8~12자사이의 ID값인지 검사하고싶습니다.
//알파벳은 대소문자를 모두허용할 경우에 정규 표현식을 이용해서 검증하는 코드를 작성해보세요


public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String id2 = "Dlxodnjs0317";
		String regExp = "[a-zA-Z]\\d+{8,12}";
		boolean isMatch = Pattern.matches(regExp, id2);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}else {
			System.out.println("ID로 사용할수없습니다.");
		}
	}
}
