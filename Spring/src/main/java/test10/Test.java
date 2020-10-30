package test10;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML기반 빈관리 컨테이너
				//스프링에서는 객체를 관리하는 컨테이너를 '빈 컨테이너'라고 부릅니다.
				//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법으로 빈 정보를  다룹니다
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test10/beans.xml");
		
		System.out.println("[Propoerties 타입] -----------------");
		Tire spareTire = (Tire) ctx.getBean("spareTire"); 
		for(Entry<Object,Object> entry : spareTire.getSpec().entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		
		}

		System.out.println("[Map 타입]------------------------");
		
		Car car1 = (Car) ctx.getBean("car1");
		for(Entry<String,Object> entry:car1.getOptions().entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}
}
