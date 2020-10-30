package test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//xml기반 빈관리 컨테이너
		//스프링에서는 ㅁ객체를 관리하는 컨테이너를 '빈 컨테이너' 라고 부릅니다.
		//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법을 ㅗ빈 정보를 다룹니다.
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("test03/beans.xml");
		
		System.out.println("[컨테이너에 보관된 객체의 이름 출력]");
		for(String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		//빈의 이름을 지정하지 않았을 때  빈의 이름은 자동으로 지정됩니다.
		//동일한 클래스 객체가 생성될때를 대비해서 빈의 이름은
		//"패키지이름 + 클래스 이름 + #인덱스"를 빈의 이름으로 사용합니다.
		//인덱스는 0부터시작합니다.
		//익명빈의 경우 클레스 이름(test.score)은 
		//첫번째 빈(test03.score#0)의 별명이 됩니다.
		System.out.println("[익명 빈 객체 꺼내기]");
		Score score1 = (Score) ctx.getBean("test03.Score");
		Score score2 = (Score) ctx.getBean("test03.Score#0");
		
		if(score1==score2) System.out.println("score==score#0");
		Score score3 = (Score) ctx.getBean("test03.Score#1");
		if(score1!=score3) System.out.println("score!=score#1");
		
		System.out.println("[클래스 타입으로 빈 꺼내기]");
		//Score score4 = (Score) ctx.getBean(test03.Score.class);
		//클래스 타입으로도 객체를 꺼낼 수 있습니다. 하지만 같은 타입의 객체가 여러개 있을 경우
		//빈컨테이너 입장에서 어떤 객체를 반활할지 알 수 없기 때문에 예외가 발생합니다.
	
		
	}
}
