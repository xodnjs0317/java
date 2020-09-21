package day35.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		scores.put(new Integer(87), "문지우");
		scores.put(new Integer(98), "이태원");
		scores.put(new Integer(75), "안한비");
		scores.put(new Integer(85), "유재헌");
		scores.put(new Integer(80), "유호성");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수 : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수 : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점이거나 바래 아래 점수 : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수 : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(남은 객체수 : "+scores.size()+")");
		}
		
		
	}

}
