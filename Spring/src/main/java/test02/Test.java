package test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//xml기반 빈관리 컨테이너
		//스프링에서는 ㅁ객체를 관리하는 컨테이너를 '빈 컨테이너' 라고 부릅니다.
		//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법을 ㅗ빈 정보를 다룹니다.
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("test02/beans.xml");
		
		System.out.println("[컨테이너에 보관된 객체의 이름 출력]");
		for(String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		System.out.println("[score2의 별명 출력]");
		for(String alias : ctx.getAliases("score2")) {
			System.out.println(alias);
		}
		Score score = (Score) ctx.getBean("score");
		Score score2= (Score) ctx.getBean("score2");
		Score score3= (Score) ctx.getBean("score3");
		Score score4= (Score) ctx.getBean("score4");
		
		Score scoreOK = (Score) ctx.getBean("score-ok!");
		System.out.println("[빈 꺼내기]");
		if(score!=null) System.out.println("score 찾았음");
		if(score2!=null) System.out.println("score2 찾았음");
		if(score3!=null) System.out.println("score3 찾았음");
		if(score4!=null) System.out.println("score4 찾았음");
		if(scoreOK!=null) System.out.println("score-ok 찾았음");
		
		System.out.println("[생성된 빈 비교]");
		if(score == score2)System.out.println("score==score2");
		if(score2 == score3)System.out.println("score2==score3");
		if(score3 == score4)System.out.println("score3==score4");
		if(score4 == scoreOK)System.out.println("score4==score-ok");
		
	}

}
