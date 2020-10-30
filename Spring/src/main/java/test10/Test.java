package test10;

import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML��� ����� �����̳�
				//������������ ��ü�� �����ϴ� �����̳ʸ� '�� �����̳�'��� �θ��ϴ�.
				//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ������� �� ������  �ٷ�ϴ�
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test10/beans.xml");
		
		System.out.println("[Propoerties Ÿ��] -----------------");
		Tire spareTire = (Tire) ctx.getBean("spareTire"); 
		for(Entry<Object,Object> entry : spareTire.getSpec().entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		
		}

		System.out.println("[Map Ÿ��]------------------------");
		
		Car car1 = (Car) ctx.getBean("car1");
		for(Entry<String,Object> entry:car1.getOptions().entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}
}
