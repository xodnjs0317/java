package day35.Collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
	Map<String, String> map = new Hashtable<String, String>();
	
	map.put("spring", "12");
	map.put("summer", "123");
	map.put("fall", "1234");
	map.put("winter", "12345");
	
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println("[ ���̵�� ��й�ȣ�� �Է����ּ��� ]");
		System.out.print("���̵� : ");
		String id = scanner.nextLine();
		
		System.out.print("��й�ȣ : ");
		String password = scanner.nextLine();
		
		if(map.containsKey(id)) {
			if(map.get(id).contentEquals(password)) {
				System.out.println(">>>�α����� �Ǿ����ϴ�.");
				break;
			} else {
				System.out.println(">>>��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				System.out.println();
			}
		} else {
			System.out.println(">>>�Է��Ͻ� ID�� �������� �ʽ��ϴ�.");
			System.out.println();
		}
		
		
		
		}
	}

}

