package day32.ex;

public class ContainerExample2 {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("È«±æµ¿","µµÀû");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("È«±æµ¿",35);
		String name2 = container2.getKey();
		int age= container2.getValue();
	}
}


	class Container<K,V>{
		private K  key;
		private V  value;
		
		public K getKey() {return this.key;}
		public V getValue() {return this.value;}
		
		public void set(K key, V value) {this.key = key; this.value= value;
		}
	}
