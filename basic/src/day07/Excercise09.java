package day07;

import java.util.Scanner;

public class Excercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum=0;
		double avg= 0.0;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		//Ű����κ��� �л����� �� �л����� ������ �Է¹޾Ƽ�, �ְ����� �� ��� ������ ���ϴ����α׷��Դϴ�. �������� ���� �˸°� �ۼ����ּ���~
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.�л���|2.�����Է�|3.�����׽�Ʈ|4.�м�|5.����");
			System.out.println("---------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			if(selectNo==1) {
				System.out.println("�л���>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} 
			else if(selectNo==2) {
				for(int i=0;i<studentNum;i++) 
				{
				System.out.print("scores["+i+"] :");
				scores[i] = scanner.nextInt();
				}
			}
			else if(selectNo==3) {
				for(int i=0;i<studentNum;i++) 
				{
				System.out.println("scores["+i+"] :"+scores[i]);
			}
			}
			else if(selectNo==4) {
				for(int i = 0;i<scores.length;i++) {
					if(max<scores[i]) {
						max=scores[i];
					}
				}
				for(int o=0;o<scores.length;o++) {
					sum += scores[o];
				}
				System.out.println("�ְ� ���� : "+ max );
				avg = (double)sum/scores.length;
				System.out.println("��� ���� : " +avg );
			}
			else if(selectNo==5) {
				run = false;
			}
			
			}	
				
				
			System.out.println("���α׷�����");
	}	

			
	
		
		}
