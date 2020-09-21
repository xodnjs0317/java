package day04;

public class ConditionOperatorTest {
	public static void main(String[] args) {
		//삼항 연산자를 사용해서 90점 이상이면 A등급
		//80점 이상이면 B등급 70점이상이면 C등급 나머지는 F인 프로그램을 만드세요.
		
		int score = 30;
		
		char grade = (score>=90) ? 'A' : (score>=80) ? 'B' : (score>=70) ? 'C' : 'F';
		
		System.out.println(score + ""+ "점은" + grade + "등급입니다.");
	
		
	
		
	}
}
