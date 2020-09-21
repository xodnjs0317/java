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
		
		
		//키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고점수 및 평균 점수를 구하는프로그램입니다. 실행결과를 보고 알맞게 작성해주세요~
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.학생수|2.점수입력|3.점수테스트|4.분석|5.종료");
			System.out.println("---------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			if(selectNo==1) {
				System.out.println("학생수>");
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
				System.out.println("최고 점수 : "+ max );
				avg = (double)sum/scores.length;
				System.out.println("평균 점수 : " +avg );
			}
			else if(selectNo==5) {
				run = false;
			}
			
			}	
				
				
			System.out.println("프로그램종료");
	}	

			
	
		
		}
