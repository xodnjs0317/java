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
		
		//Random Ŭ������ �޼ҵ�
		//nextboolean() boolean Ÿ���� ����������
		//nextdouble() double Ÿ���� ����������
		//nextint intŸ���� ����������
		
 		System.out.println("���� ��ȣ :");
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("��÷ ��ȣ: ");
		for(int i =0 ; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
			
		}
		System.out.println();
		//��÷����
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("��÷����:");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		}else {
			System.out.println("��÷ ���� �ʾҽ��ϴ�.");
		}
	}
}
