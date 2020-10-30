package test05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML기반 빈관리 컨테이너
				//스프링에서는 객체를 관리하는 컨테이너를 '빈 컨테이너'라고 부릅니다.
				//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법으로 빈 정보를  다룹니다.
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test05/beans.xml");
		
		Score score1 = (Score) ctx.getBean("score1");
		System.out.println(score1);
		
		Score score2 = (Score) ctx.getBean("score2");
		System.out.println(score2);
		
	}
}
