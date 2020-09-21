package day26;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		int[] selectNumber2 = new int[6];
		
		long l = System.currentTimeMillis();
		long l2 = System.nanoTime();
		
		Random random = new Random(3);
		Random random2 = new Random(12);
		
		//Random 클래스의 메소드
		//nextboolean() boolean 타입의 난수를리턴
		//nextdouble() double 타입의 난수를리턴
		//nextint int타입의 난수를리턴
		
 		System.out.println("선택 번호 :");
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨 번호: ");
		for(int i =0 ; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
			
		}
		System.out.println();
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부:");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨 되지 않았습니다.");
		}
	}
}
