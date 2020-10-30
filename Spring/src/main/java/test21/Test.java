package test21;

import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML��� ����� �����̳�
				//������������ ��ü�� �����ϴ� �����̳ʸ� '�� �����̳�'��� �θ��ϴ�.
				//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ������� �� ������  �ٷ�ϴ�
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test21/beans.xml");
		
		Car car = (Car) ctx.getBean("car");
		
		Engine engine = (Engine) ctx.getBean("engine");
		
		engine.setCc(1997);
		engine.setMaker("Hyundai");
		
		if(car!=null) {
			System.out.println("car!=null");
		}
		if(engine!=null) {
			System.out.println("engine!=null");
		}
		System.out.println(car);
	}
}

