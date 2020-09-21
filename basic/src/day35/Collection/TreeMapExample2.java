package day35.Collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("forever", new Integer(60));
		treeMap.put("description", new Integer(40));
		treeMap.put("apple", new Integer(10));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(10));
		treeMap.put("base", new Integer(20));
		treeMap.put("guess", new Integer(70));
		treeMap.put("cherry", new Integer(30));
		
		System.out.println("[c~f ������ �ܾ� �˻�]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue()+"������");
		}
		System.out.println();
		
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Map.Entry<String, Integer>> descendingEntrySet =  descendingMap.entrySet();
		
		for(Map.Entry<String, Integer> entry : descendingEntrySet) {
			System.out.println(entry.getKey()+" - "+entry.getValue()+" ");
		}
		System.out.println();
		
		
		NavigableMap<String, Integer> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<String, Integer>> ascendingEntrySet =  ascendingMap.entrySet();
		
		for(Map.Entry<String, Integer> entry : ascendingEntrySet) {
			System.out.println(entry.getKey()+" - "+entry.getValue()+" ");
		}
		
	}

}
