package day06;

public class ArrayCreateByValueListExample2 {
public static void main(String[] args) {
	int[] scores;
	scores = new int[] {83,90,87};
	int sum1 = 0;
	for(int i =0; i<3;i++) {
		sum1 +=scores[i]; 
	}
	System.out.println("총합:" +sum1); //배열의 총합
	
	int sum2 = add(new int[] {83, 90, 87});
	System.out.println("총합:" +sum2);
	System.out.println();
}
	public static int add(int[] scores) {//<- 메소드를 부를때 쓰는 문구
		int sum= 0;							//메소드에 들어가는 입력값 메소드에83,90,87의 값이 배열로들어감
		for(int i= 0; i <3; i++) {
			sum+= scores[i];
		}
		return sum; //메소드출력값
	
}

	
}
