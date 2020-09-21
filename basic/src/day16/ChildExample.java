package day16;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		/*
		 * parent.field2 = "date2";   //자동 타입변환으로 자식클래스의 고유필드와 메소드는 사용불가
		 * parent.method3();
		 */
		//강제 타입 변환은 원래부터 자식 객체였던 객체만이 원래의 타입인 자식클래스로 돌아갈수 있습니다.
		//원래 부모타입이었던 객체는 자식 클래스로 강제타입변환이 불가합니다.
		Child child =(Child) parent; //강제타입변환
		child.field2 = "yyy";
		child.method3();
	}
}
