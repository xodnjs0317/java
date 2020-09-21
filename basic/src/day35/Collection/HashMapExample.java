package day35.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("������", 95);
		map.put("���¿�", 90);
		map.put("������", 85);
		map.put("��ȣ��", 95);
		map.put("���Ѻ�", 80);
		System.out.println("�� Entry tn : "+map.size()); //����� �� Entry �� ���
		
		//��ü ã��
		System.out.println("\t ������ : "+map.get("������"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyiterator = keySet.iterator();
		while(keyiterator.hasNext()) {
			String key = keyiterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();		
		
		//��ü ����
		map.remove("���¿�");
		System.out.println("�� Entry tn : "+map.size()); //����� �� Entry �� ���
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
				
		}
		System.out.println();
		
		map.clear();
		System.out.println("�� Entry tn : "+map.size()); //����� �� Entry �� ���
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		
		}
	}

}
