package day35.Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		NavigableSet<Integer> descindingSet = scores.descendingSet();
		//descendingSet() : 내림차순으로 정렬
		//NavigableSet은 iterator와 비슷한 기능을 수행
		for(Integer score : descindingSet) {
			System.out.print(score+" ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descindingSet.descendingSet();
		//descendingSet()을 한번 더 사용하여 오름차순으로 정렬
		for(Integer score : ascendingSet) {
			System.out.print(score+" ");
		}
		
	}

}
