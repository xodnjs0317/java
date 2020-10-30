package test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//xml기반 빈관리 컨테이너
		//스프링에서는 ㅁ객체를 관리하는 컨테이너를 '빈 컨테이너' 라고 부릅니다.
		//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법을 ㅗ빈 정보를 다룹니다.
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("test01/beans.xml");
		Score score = (Score) ctx.getBean("score");
		
		System.out.println("합계 : "+score.sum());
		System.out.println("평균 : "+score.average());
		
	}

}
