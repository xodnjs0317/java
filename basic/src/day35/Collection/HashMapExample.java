package day35.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("문지우", 95);
		map.put("이태원", 90);
		map.put("유재헌", 85);
		map.put("유호성", 95);
		map.put("안한비", 80);
		System.out.println("총 Entry tn : "+map.size()); //저장된 총 Entry 수 얻기
		
		//객체 찾기
		System.out.println("\t 문지우 : "+map.get("문지우"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyiterator = keySet.iterator();
		while(keyiterator.hasNext()) {
			String key = keyiterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();		
		
		//객체 삭제
		map.remove("이태원");
		System.out.println("총 Entry tn : "+map.size()); //저장된 총 Entry 수 얻기
		
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
		System.out.println("총 Entry tn : "+map.size()); //저장된 총 Entry 수 얻기
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
		
		}
	}

}
