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
	// �Ϲ�����ArrayList�� ����ȭ�� ���·� ��ȯ�ϴ� �޼ҵ�
	
	
	Set<String> set = Collections.synchronizedSet(new HashSet<String>());
	
	//�Ϲ����� HashSet�� ����ȭ�� ���·� ��ȯ�ϴ� �޼ҵ�
	
	Map<String, String> map
	= Collections.synchronizedMap(new HashMap<String,String>());
	//�Ϲ����� HashMap�� ����ȭ�� ���·� ��ȯ�ϴ� �޼ҵ�
	Map<String, String> map2
	= Collections.synchronizedMap(new ConcurrentHashMap<String,String>());
	//ConcurrentHashMap�� ����ϸ� �����忡 �����ϸ鼭�� ��Ƽ �����尡 ��Ҹ� �Ѳ����� ó���������մϴ�.
	
	Queue<String> queue = new ConcurrentLinkedQueue<String>();
	//ConcurrentLinkedQueue �� ����ϸ� ����� ������� 
	//�ʰ� �������� �����尡 �����Ҷ� �ּ��� �ϳ��� �����尡 �����ϰ� ��Ҹ� 
	//�����ϰų� ��� ���ݴϴ�.
}
	
}
