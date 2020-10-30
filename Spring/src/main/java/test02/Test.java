package test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//xml��� ����� �����̳�
		//������������ ����ü�� �����ϴ� �����̳ʸ� '�� �����̳�' ��� �θ��ϴ�.
		//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ����� �Ǻ� ������ �ٷ�ϴ�.
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("test02/beans.xml");
		
		System.out.println("[�����̳ʿ� ������ ��ü�� �̸� ���]");
		for(String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		System.out.println("[score2�� ���� ���]");
		for(String alias : ctx.getAliases("score2")) {
			System.out.println(alias);
		}
		Score score = (Score) ctx.getBean("score");
		Score score2= (Score) ctx.getBean("score2");
		Score score3= (Score) ctx.getBean("score3");
		Score score4= (Score) ctx.getBean("score4");
		
		Score scoreOK = (Score) ctx.getBean("score-ok!");
		System.out.println("[�� ������]");
		if(score!=null) System.out.println("score ã����");
		if(score2!=null) System.out.println("score2 ã����");
		if(score3!=null) System.out.println("score3 ã����");
		if(score4!=null) System.out.println("score4 ã����");
		if(scoreOK!=null) System.out.println("score-ok ã����");
		
		System.out.println("[������ �� ��]");
		if(score == score2)System.out.println("score==score2");
		if(score2 == score3)System.out.println("score2==score3");
		if(score3 == score4)System.out.println("score3==score4");
		if(score4 == scoreOK)System.out.println("score4==score-ok");
		
	}

}
