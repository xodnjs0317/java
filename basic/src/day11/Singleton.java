package day11;

public class Singleton {
	//정적 필드로 자기자신의 객체생성
	private static Singleton s = new Singleton();
	
	
	
	//생성자 private로 다른 클래스에서 생성에 접근하지 못하게 막아버림
	private Singleton() {
		
	}
	
	//싱글톤 객체는 유이라게 getInstance()메소드를 통해 기존의 객체를 불러올수 있음
	static Singleton getInstance() {
		return s;
		
	}
	
}
