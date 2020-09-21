package day26;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		//int 값은 같은 int byte는 같은 byte값으로 언박싱한다.
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
