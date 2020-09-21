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
		
		System.out.println("[c~f 사이의 단어검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		//subSet("c", true일시 "c"를 포함, "f", false일시 "f"를 포함하지 않음.
		//"c" <= x <"f" 의 값을 저장
		for(String word : rangeSet) {
			System.out.println(word);
		}
		
	}

}
