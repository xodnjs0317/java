package day05;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		System.out.println("�޼������Է����ּ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է����ּ���.");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputStirng;
		
		do {
			System.out.println(">");
			inputStirng = scanner.nextLine();
			System.out.println(inputStirng);
		} while(!inputStirng.equals("q"));
		  System.out.println();
		  System.out.println("���α׷�����");
		}
	}
	

