package day11;

public class SingletonExample {
	public static void main(String[] args) {
		//Signleton obj1 = new Signleton();
		//Singleton obj2 = new Singleton();
		//기존처럼 new로 새로운 객체를 만들수가 없음.
		
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		
		if(obj3==obj4) {
			System.out.println("같은 싱글톤 객체 입니다.");
		}else {
			System.out.println("다른 싱글톤 객체 입니다.");
		}
	}
}
