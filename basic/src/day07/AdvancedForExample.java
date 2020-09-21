package day07;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		//완벽히 같은 for문 입니다.
		//for(int i= 0; i<scores.length;i++) {
		//	sum = sum + scores[i];
		//}
		
		
		
		System.out.println("점수 총합  : ");
		
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 = " + avg);
		
	}

}
