package day04;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("������100~90�Դϴ�.");
			System.out.println("�����A�Դϴ�.");
			} else if (score>=80) {
				System.out.println("������80~89�Դϴ�.");
				System.out.println("�����A�Դϴ�.");
			} else if (score>=70) {
				System.out.println("������70~79�Դϴ�.");
				System.out.println("�����C�Դϴ�.");
		    } else if (score>=60) {
				System.out.println("������60~69�Դϴ�.");
				System.out.println("�����D�Դϴ�.");
		    }
		
		
	}
}