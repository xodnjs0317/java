package test06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//XML��� ����� �����̳�
				//������������ ��ü�� �����ϴ� �����̳ʸ� '�� �����̳�'��� �θ��ϴ�.
				//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ������� �� ������  �ٷ�ϴ�.
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test06/beans.xml");
		
		Score score1 = (Score) ctx.getBean("score1");
		System.out.println(score1);
		
		Score score2 = (Score) ctx.getBean("score2");
		System.out.println(score2);
		
	}
}
