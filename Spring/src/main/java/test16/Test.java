package test16;

import java.text.SimpleDateFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
				//XML기반 빈관리 컨테이너
				//스프링에서는 객체를 관리하는 컨테이너를 '빈 컨테이너'라고 부릅니다.
				//스프링 IOC 컨테이너는 XML과 어노테이션 두가지 방법으로 빈 정보를  다룹니다
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("test16/beans.xml");
		
		System.out.println("[CoustomDateEditor 활용]------------------");
		
		SimpleDateFormat dateFormat = (SimpleDateFormat) ctx.getBean("dateFormat");
		
		Tire hankookTire =(Tire) ctx.getBean("hankookTire");
		System.out.println(hankookTire.getMaker());
		System.out.println(dateFormat.format(hankookTire.getCreateDate()));
		
		System.out.println("--------------------------------------------------");
		
		Tire kumhoTire =(Tire) ctx.getBean("kumhoTire");
		System.out.println(kumhoTire.getMaker());
		System.out.println(dateFormat.format(kumhoTire.getCreateDate()));
		System.out.println("--------------------------------------------------");
	}
}

