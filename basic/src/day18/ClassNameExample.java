package day18;

public class ClassNameExample {
	public static void main(String[] args) {
		//NestClassName cn = new NestClassName();
		//중첩된 클래스는 중첩되기전의 클래스를 만들기 전에는바로 만들수있습니다.
		ClassName cn = new ClassName();
		ClassName.NestedClassName nc = cn.new NestedClassName();
		
		nc.i = 1;//일단 객체를 만들고 나면 일반 클레스처럼 메소드와 필드를  불러올  수 있습니다.
	}
}
