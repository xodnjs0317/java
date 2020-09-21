package day08;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		String[] names=null;

		Scanner scanner = new Scanner(System.in);
		//키보드로부터 학생수와 각 학생들의 이름을 입력받아서 학생들의 이름을 출력하는 프로그램을 작성하세요
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.학생수|2.이름입력|3.학생리스트|4.종료");
			System.out.println("---------------------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			if(selectNo==1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				names = new String[studentNum];
			} 
			else if(selectNo==2) {
				scanner.nextLine();
				for(int i=0;i<studentNum;i++) 
				{
				System.out.print("names["+i+"] :");
				names[i]= scanner.nextLine();
				
				}
			}
			else if(selectNo==3) {
				
				for(int i=0;i<studentNum;i++) 
				{
				System.out.println("names["+i+"] :"+names[i]);
			}
			}
			else if(selectNo==4) {
				run = false;
			}
			
			}	
				
				
			System.out.println("프로그램종료");
	}	

			
	
		
}
