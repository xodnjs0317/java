package day37.io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {
	public static void main(String[] args) throws IOException {
		System.out.println("==�޴�==");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ���� �ϱ�");
		System.out.println("�޴��� �����ϼ��� :");
		
		InputStream is = System.in;
		char inputChar = (char)is.read();
		switch(inputChar) {
			case'1':
				System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
				break;
			case'2':
				System.out.println("���� ����� �����ϼ̽��ϴ�.");
				break;
			case'3':
				System.out.println("���� �Ա��� �����ϼ̽��ϴ�.");
				break;
			case'4':
				System.out.println("���� �ϱ⸦ �����ϼ̽��ϴ�.");
				break;
		}
	}
}
