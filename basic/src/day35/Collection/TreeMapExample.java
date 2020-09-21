package day35.Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		scores.put(new Integer(87), "������");
		scores.put(new Integer(98), "���¿�");
		scores.put(new Integer(75), "���Ѻ�");
		scores.put(new Integer(85), "������");
		scores.put(new Integer(80), "��ȣ��");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �Ʒ� ���� : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� ���� ���� : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85���̰ų� �ٷ� ���� ���� : "+entry.getKey()+"-"+entry.getValue()+"\n");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(���� ��ü�� : "+scores.size()+")");
		}
		
		
	}

}
