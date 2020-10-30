package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g1 = ctx.getBean("greeter",Greeter.class);
		Greeter g2 = ctx.getBean("greeter",Greeter.class);
		System.out.println("(g1==g2)="+(g1==g2));
		//한번 사용한 객체를 다른 클래스에서도 사용가능하다.
		ctx.close();
		
	}
}
