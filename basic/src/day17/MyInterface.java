package day17;

public interface MyInterface {
	public void method1();
	
	
	//디폴트 메소드를 사용하는 이유는 부득이하게 인터페이스에 또 다른 메소드를 추가할 경우
	//수많은 구현객체들을 모두 수정할 필요없이 하나의 메소드만 추가하기 위해서 사용하게 됩니다.
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
