package day31.Generic;

public class Box2Example {
	public static void main(String[] args) {
		Box2<String> box2 = new Box2<String>();
		box2.set("hello");
		String str =box2.get();
		
		Box2<Integer> box3 = new Box2<Integer>();
		box3.set(6);
		int value = box3.get();
		
		Box2<Apple> box4 = new Box2<Apple>();
		box4.set(new Apple());
		Apple apple = box4.get();
		
		//���׸��� �����Ҷ� Ÿ���� �������شٸ� Ÿ�� ��ȯ���� ��ü�� ����� �� �־
		//�����ؿ� ���� ���Ҹ��� �δ��� �����ϴ�.
	}
}
