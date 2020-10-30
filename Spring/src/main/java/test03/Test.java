package test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//xml��� ����� �����̳�
		//������������ ����ü�� �����ϴ� �����̳ʸ� '�� �����̳�' ��� �θ��ϴ�.
		//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ����� �Ǻ� ������ �ٷ�ϴ�.
		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("test03/beans.xml");
		
		System.out.println("[�����̳ʿ� ������ ��ü�� �̸� ���]");
		for(String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		//���� �̸��� �������� �ʾ��� ��  ���� �̸��� �ڵ����� �����˴ϴ�.
		//������ Ŭ���� ��ü�� �����ɶ��� ����ؼ� ���� �̸���
		//"��Ű���̸� + Ŭ���� �̸� + #�ε���"�� ���� �̸����� ����մϴ�.
		//�ε����� 0���ͽ����մϴ�.
		//�͸���� ��� Ŭ���� �̸�(test.score)�� 
		//ù��° ��(test03.score#0)�� ������ �˴ϴ�.
		System.out.println("[�͸� �� ��ü ������]");
		Score score1 = (Score) ctx.getBean("test03.Score");
		Score score2 = (Score) ctx.getBean("test03.Score#0");
		
		if(score1==score2) System.out.println("score==score#0");
		Score score3 = (Score) ctx.getBean("test03.Score#1");
		if(score1!=score3) System.out.println("score!=score#1");
		
		System.out.println("[Ŭ���� Ÿ������ �� ������]");
		//Score score4 = (Score) ctx.getBean(test03.Score.class);
		//Ŭ���� Ÿ�����ε� ��ü�� ���� �� �ֽ��ϴ�. ������ ���� Ÿ���� ��ü�� ������ ���� ���
		//�������̳� ���忡�� � ��ü�� ��Ȱ���� �� �� ���� ������ ���ܰ� �߻��մϴ�.
	
		
	}
}
