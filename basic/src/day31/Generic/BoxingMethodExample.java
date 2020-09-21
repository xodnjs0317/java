package day31.Generic;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box2<Integer> box1 =Util.<Integer>boxing(100);
		int intValue =box1.get();
		
		Box2<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
		
		
	}
}
