package day08;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		String[] names=null;

		Scanner scanner = new Scanner(System.in);
		//Ű����κ��� �л����� �� �л����� �̸��� �Է¹޾Ƽ� �л����� �̸��� ����ϴ� ���α׷��� �ۼ��ϼ���
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.�л���|2.�̸��Է�|3.�л�����Ʈ|4.����");
			System.out.println("---------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			if(selectNo==1) {
				System.out.print("�л���>");
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
				
				
			System.out.println("���α׷�����");
	}	

			
	
		
}
