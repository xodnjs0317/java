package day36.Synchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionSynchronized {
public static void main(String[] args) {
	List<String> list = 
			Collections.synchronizedList(new ArrayList<String>());
	// 일반적인ArrayList를 동기화된 형태로 반환하는 메소드
	
	
	Set<String> set = Collections.synchronizedSet(new HashSet<String>());
	
	//일반적인 HashSet을 동기화된 형태로 반환하는 메소드
	
	Map<String, String> map
	= Collections.synchronizedMap(new HashMap<String,String>());
	//일반적인 HashMap을 동기화된 형태로 반환하는 메소드
	Map<String, String> map2
	= Collections.synchronizedMap(new ConcurrentHashMap<String,String>());
	//ConcurrentHashMap을 사용하면 스레드에 안전하면서도 멀티 스레드가 요소를 한꺼번에 처리가가능합니다.
	
	Queue<String> queue = new ConcurrentLinkedQueue<String>();
	//ConcurrentLinkedQueue 을 사용하면 잠금을 사용하지 
	//않고도 여러개의 스레드가 접근할때 최소한 하나의 스레드가 안전하게 요소를 
	//저장하거나 얻게 해줍니다.
}
	
}
