package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	//스프링은 객체를 생성하고 초기화하는 기능을 제공하고 있습니다.
	//스프링에서 생성하고 사용하는 객체를 Bean이라고 부릅니다.
	//@bean 에노테이션을 붙이면 해당 메소드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록합니다.
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 헬로");
		System.out.printf("%s, 헬로", "굳");
		System.out.println();
		return g;
	}
}
