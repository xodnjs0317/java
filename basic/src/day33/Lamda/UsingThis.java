package day33.Lamda;

public class UsingThis {

	public int outterField = 10;
	
	class Inner {
		int innerField =20;
		
		void method() {
			MyFunctionalInterface fi = ()-> {
				System.out.println("outterField : "+ outterField);
				System.out.println("outterField : "+ UsingThis.this.outterField + "\n");
				//바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
				
				
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField+"\n");
				//람다식 내부에서 this는 inner객체를 참조가능
			};
			fi.method();
			//일반적으로 익명 객체 내부에서는 this는 익명 객체 내부의 참조입니다. 하지만
			//람다식에서는 this는 내부적으로 생성되는 익명 객체의 참조가 아니라 람다식을 실행한
			//객체를 참조하게 됩니다.
		}
	}
}
