package day13;

import java.util.Scanner;

public class BankApplication {
private static Account[] accountArray = new Account[100];
private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
	boolean run = true;
	while(run) {
		System.out.println("----------------------------------");
		System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
		System.out.println("----------------------------------");
		System.out.print("����>");
		
		int selectNo = scanner.nextInt();
		
		
		if(selectNo==1) {
			createAccount();
		} else if (selectNo==2) {
		  accountList();
		} else if (selectNo==3) {
		  deposit();	
		} else if (selectNo==4) {
			withdraw();
		} else if (selectNo==5) {
			run=false;
		}
	}
		System.out.println("���α׷� ����");
}
		
		
		private static void createAccount() {
			System.out.println("---------------------");
			System.out.println("���»���");
			System.out.println("---------------------");
			 
			System.out.println("���¹�ȣ>");
			String ano = scanner.next();
			
			String owner = scanner.next();
			System.out.println("�ݾ�>");
			int balance = scanner.nextInt();
			Account account = new Account(ano , owner, balance);
			for(int i = 0; i< accountArray.length; i++) {  
			if(accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
		} 
			
			}	
		}
		private static void accountList() {
			System.out.println("---------------------");
			System.out.println("���¸��");
			System.out.println("---------------------");
			
			for(int i = 0; i<accountArray.length;i++) 
			{ if(accountArray[i] ==null) break;
				System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwer()+ "\t"+accountArray[i].getBalance() );
			}
			
	
		}
		
		private static void deposit() {
			System.out.println("---------------------");
			System.out.println("����");
			System.out.println("---------------------");
			
			System.out.println("���¹�ȣ :");
			String ano = scanner.next();
			System.out.println("���ݾ� :");
			int balance = scanner.nextInt();
			System.out.println("������ �����Ǿ����ϴ�.");
			 
			Account account = findAccount(ano);
			 
			if(account == null) {
				System.out.println("��� : ������ �����Ǿ����ϴ�.");
			}
		}
		private static void withdraw() {
			System.out.println("---------------------");
			System.out.println("���");
			System.out.println("---------------------");
			
			System.out.println("���¹�ȣ :");
			String ano = scanner.next();
			System.out.println("��ݾ� :");
			int balance = scanner.nextInt();
			
			Account account = findAccount(ano);
			
			if(account == null) {
				System.out.println("��� : ���°� �������� �ʽ��ϴ�.");
				return;
		}
			if(account.getBalance() < balance) {
				System.out.println("���ݾ׺��� ���� �ݾ��� ����� �� �����ϴ�.");
				return;
			}
			account.setBalance(account.getBalance()-balance);
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
		}
		private static Account findAccount(String ano) {
			Account account = null; 
			for(int i = 0; i<accountArray.length;i++) {
				if (accountArray[i] != null) {
					if(accountArray[i].getAno().equals(ano)) {
						account = accountArray[i];
						break;
					}
				}
			}
					
			return account;
			
		}
}
