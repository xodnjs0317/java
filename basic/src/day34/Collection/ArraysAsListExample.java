package day34.Collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		//List<String> list1 = Arrays.asList()
		//String�� ���� ��ü�� ���� ArrayList ��ü����
		for(String name : list1) {
			System.out.println(name);
		}
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
