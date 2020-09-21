package day04;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가100~90입니다.");
			System.out.println("등급은A입니다.");
			} else if (score>=80) {
				System.out.println("점수가80~89입니다.");
				System.out.println("등급은A입니다.");
			} else if (score>=70) {
				System.out.println("점수가70~79입니다.");
				System.out.println("등급은C입니다.");
		    } else if (score>=60) {
				System.out.println("점수가60~69입니다.");
				System.out.println("등급은D입니다.");
		    }
		
		
	}
}
