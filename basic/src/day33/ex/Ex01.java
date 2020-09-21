package day33.ex;

import java.util.function.Consumer;

//consumer 함수 인터페이스를 활용해서 매개변수를 int 로 받아 그단에 해당하는 구구단출력을 람다식으로 만들어보세요.

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
