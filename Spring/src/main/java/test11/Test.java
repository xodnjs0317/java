package test11;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML기반 빈관리 컨테이너
				//스프링에서는 객체를 관리하는 컨테이너를 '빈 컨테이너'라고 부릅니다.
				//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법으로 빈 정보를  다룹니다
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test11/beans.xml");
		
		Tire t1 = (Tire) ctx.getBean("hankookTire");
		Tire t2 = (Tire) ctx.getBean("kumhoTire");
		Tire t3 = (Tire) ctx.getBean("hankookTire");
		
		System.out.println("t1-->"+t1.toString());
		System.out.println("t2-->"+t2.toString());
		System.out.println("t3-->"+t3.toString());
		
		if(t1!=t2) {
			System.out.println("t1!=t2");
		}
		//getBean은 호출할때마다 팩토리 메소드를 호출하지 않고,
		//처음 빈을 만들때 딱 한번만 호출합니다.
		if(t1==t3) {
			System.out.println("t1==t3");
		}
		
		
		
	}
}
