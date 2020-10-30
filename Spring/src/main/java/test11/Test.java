package test11;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML��� ����� �����̳�
				//������������ ��ü�� �����ϴ� �����̳ʸ� '�� �����̳�'��� �θ��ϴ�.
				//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ������� �� ������  �ٷ�ϴ�
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test11/beans.xml");
		
		Tire t1 = (Tire) ctx.getBean("hankookTire");
		Tire t2 = (Tire) ctx.getBean("kumhoTire");
		Tire t3 = (Tire) ctx.getBean("hankookTire");
		
		System.out.println("t1-->"+t1.toString());
		System.out.println("t2-->"+t2.toString());
		System.out.println("t3-->"+t3.toString());
		
		if(t1!=t2) {
			System.out.println("t1!=t2");
		}
		//getBean�� ȣ���Ҷ����� ���丮 �޼ҵ带 ȣ������ �ʰ�,
		//ó�� ���� ���鶧 �� �ѹ��� ȣ���մϴ�.
		if(t1==t3) {
			System.out.println("t1==t3");
		}
		
		
		
	}
}
