package day33.ex;

import java.util.function.Consumer;

//consumer �Լ� �������̽��� Ȱ���ؼ� �Ű������� int �� �޾� �״ܿ� �ش��ϴ� ����������� ���ٽ����� ��������.

public class Ex01 {
	public static void main(String[] args) {

		Consumer<Integer> consumer = t-> {

		for (int i = 1; i < 10; i++) {
			
			System.out.println(i + "X"+t+"="+(i*t));
		}
		};
		consumer.accept(5);
	}
}
