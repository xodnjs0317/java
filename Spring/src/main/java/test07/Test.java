package test07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML기반 빈관리 컨테이너
				//스프링에서는 객체를 관리하는 컨테이너를 '빈 컨테이너'라고 부릅니다.
				//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법으로 빈 정보를  다룹니다.
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test07/beans.xml");
		
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);
		
		Engine engine = (Engine) ctx.getBean("engine1");
		engine.cc = 3000;
		System.out.println(car1);
		
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
		
		Car car3 = (Car) ctx.getBean("car3");
		System.out.println(car3);
		
		Car car4 = (Car) ctx.getBean("car4");
		System.out.println(car4);
		
		
	}
}
