package day35.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "������"), 95);
		map.put(new Student(1, "������"), 95); //�й��� �̸��� ������ Student�� Ű�� ����
		
		System.out.println("�� Entry �� : "+map.size());
	}

}
