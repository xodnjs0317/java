package day32.ex;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer>pair = new Pair<>("ȫ�浿",35);
		Integer age = Util.getValue(pair,"ȫ�浿");
		System.out.println(age);
		
		ChildPair<String, Integer> cildPair = new ChildPair<>("ȫ���",20);
		Integer childAge = Util.getValue(childPair,"ȫ���";)
		System.out.println(childAge);
		
		
	}
}

	class Pair<K,V> {
		private K key;
		private V value;
		
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public K getKey() {return key;}
		public V getValue() {return value;}
		
	}
	
	class ChildPair<K, V>extends Pair<K,V> {
		public ChildPair(K k, V v) {
			super(k,v);
		}
	}
	
	class OtherPair<K , V> {
		private K key;
		private V value;
		
		public OtherPair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public K getKey() {return key;}
		public V getValue() {return value;}
	}
	
	
	