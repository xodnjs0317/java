package day09;

public class Calculator {
	//메소드의 이름 규칙
	//수자로 시작하면 안되고, $와_를 제외한 특수 문자를 사용하지 말아야한다.
	// 관례적으로 메소드명은 소문자로 작성한다.
	// 서로 다른 단어가 혼합된 이름이라면 뒤이어 오는 단어의 첫머리 글자는 대문자로 작성한다.
	//startEngine
	void powerOn() {
		System.out.println("전원을 켭니다.");
		
	}
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
