package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	//�������� ��ü�� �����ϰ� �ʱ�ȭ�ϴ� ����� �����ϰ� �ֽ��ϴ�.
	//���������� �����ϰ� ����ϴ� ��ü�� Bean�̶�� �θ��ϴ�.
	//@bean �������̼��� ���̸� �ش� �޼ҵ尡 ������ ��ü�� �������� �����ϴ� �� ��ü�� ����մϴ�.
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, ���");
		System.out.printf("%s, ���", "��");
		System.out.println();
		return g;
	}
}
