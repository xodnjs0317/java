package day35.Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f ������ �ܾ�˻�]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		//subSet("c", true�Ͻ� "c"�� ����, "f", false�Ͻ� "f"�� �������� ����.
		//"c" <= x <"f" �� ���� ����
		for(String word : rangeSet) {
			System.out.println(word);
		}
		
	}

}
