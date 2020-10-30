package test15;

import java.text.SimpleDateFormat;
import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML��� ����� �����̳�
				//������������ ��ü�� �����ϴ� �����̳ʸ� '�� �����̳�'��� �θ��ϴ�.
				//������ IOC �����̳ʴ� XML�� ������̼� �ΰ��� ������� �� ������  �ٷ�ϴ�
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test15/beans.xml");
		
		
			System.out.println("[�ν��Ͻ� ���丮 �޼ҵ� Ȱ��]-----------------");
			
			SimpleDateFormat dateFormat =(SimpleDateFormat) ctx.getBean("dateFormat");
			
			Tire hankookTire = (Tire) ctx.getBean("hankookTire");
			
			System.out.println(hankookTire.getMaker());
			System.out.println(dateFormat.format(hankookTire.getCreateDate()));
			System.out.println("-----------------------------------------------");
			
			Tire kumhoTire = (Tire) ctx.getBean("kumhoTire");
			
			System.out.println(kumhoTire.getMaker());
			System.out.println(dateFormat.format(kumhoTire.getCreateDate()));
			
		
	}
}

