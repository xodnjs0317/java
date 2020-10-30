package test14;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML기반 빈관리 컨테이너
				//스프링에서는 객체를 관리하는 컨테이너를 '빈 컨테이너'라고 부릅니다.
				//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법으로 빈 정보를  다룹니다
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test14/beans.xml");
		
		System.out.println("[singleton 방식(기본)]-----------------------");
		Engine e1 = (Engine) ctx.getBean("hyundaiEngine");
		Engine e2 = (Engine) ctx.getBean("hyundaiEngine");
		
		System.out.println("e1--->"+e1.toString());
		System.out.println("e2--->"+e2.toString());
		if(e1==e2) {
			System.out.println("e1==e2");
			
		}
			System.out.println("[prototype 방식]--------------");
			Engine e3 =(Engine) ctx.getBean("kiaEngine");
			Engine e4 =(Engine) ctx.getBean("kiaEngine");
			
			System.out.println("e3--->"+e3.toString());
			System.out.println("e4--->"+e4.toString());
			if(e3!=e4) {
				System.out.println("e3!=e4");
				
			}
		
	}
}

