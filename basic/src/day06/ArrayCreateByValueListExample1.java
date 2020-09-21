package day06;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[]{83,90,87}; //배열의 값은 중가로로 묶어서 
		//값을 선언함 
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		//배열값의 출력은 배열[0] 부터 배열[갯수-1]까지 출력이 가능합니다.
		
		int sum = 0;
		for(int i =0;i<3;i++) {
			System.out.println("scores["+i+"] : " +scores[i]);
			sum +=scores[i];
		}
		System.out.println("총합 : " +sum);
		double avg = (double)sum/3;
		System.out.println("평균 : " +avg);
		
		
		

	}

}
