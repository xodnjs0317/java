package test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//xml��� ����� �����̳�
		//������������ ����ü�� �����ϴ� �����̳ʸ� '�� �����̳�' ��� �θ��ϴ�.
		//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ����� �Ǻ� ������ �ٷ�ϴ�.
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("test01/beans.xml");
		Score score = (Score) ctx.getBean("score");
		
		System.out.println("�հ� : "+score.sum());
		System.out.println("��� : "+score.average());
		
	}

}
