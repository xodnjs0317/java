package day04;

public class ConditionOperatorExample {
	public static void main(String[] args) {
		
		int score = 85;
		char grade = (score >90) ? 'A': 'F'; // ? 참:거짓 논리값을 계산했을 때 나오는 것
		
		System.out.println(score + "점은"+grade+""+"등급입니다.");
		
		
		char grade2 = (score >90) ? 'A': (score>80) ? 'B' : 'C';
		
		System.out.println(score + "점은"+grade2+""+"등급입니다.");
	}
}
