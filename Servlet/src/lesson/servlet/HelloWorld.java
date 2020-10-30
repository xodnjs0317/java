package lesson.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//서블릿 클래스는 반드시 javax.servlet.Servlet
//구현해야 합니다 .서블릿 컨테이너가 서블릿에 대해 호출할 메소드를
//정의 한것이 servlet 인터페이스입니다.
public class HelloWorld implements Servlet{
	ServletConfig config;
	//servlet 인터페이스에 정의된 5개의 메소드중
	//생명주기에 관련된 메소드는 init(),service().destroy()입니다.(생성 ,실행 ,소멸)
	
	
	@Override	//서블릿 컨테이너가 종료되거나 해당 서블릿을 비활성화 시킬때 실행
	public void destroy() {
		System.out.println("destroy() 호출됨");
	}
	@Override	//서블릿 설정 정보를 다루는 servletConfig객체 변환
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override	//서블릿을 작성한사람의 정보, 서블릿 버전, 권리등을
				//담은 문자열을 반환합니다.
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override	//서블릿을 생성한 후에 초기화 작업으 위해 수행하는 메소드
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출됨");
		this.config=config;
	}
	@Override	//클라이언트가 요청할때마다 호출되는 메소드입니다.
				//실질적으로 샐행할 코드를 적는 곳입니다.
	public void service(ServletRequest req, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() 호출됨");
	}
	
}
