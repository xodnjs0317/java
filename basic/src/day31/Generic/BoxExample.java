package day31.Generic;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");		//String -> Object (�ڵ� Ÿ�� ��ȯ)
		String name = (String) box.get();		//Object -> String(���� Ÿ�Ժ�ȯ)
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}
}
