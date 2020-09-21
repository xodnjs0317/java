package day05;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를입력해주세요.");
		System.out.println("프로그램을 종료하려면 q를 입력해주세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputStirng;
		
		do {
			System.out.println(">");
			inputStirng = scanner.nextLine();
			System.out.println(inputStirng);
		} while(!inputStirng.equals("q"));
		  System.out.println();
		  System.out.println("프로그램종료");
		}
	}
	

