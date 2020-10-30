package lesson.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//���� Ŭ������ �ݵ�� javax.servlet.Servlet
//�����ؾ� �մϴ� .���� �����̳ʰ� ������ ���� ȣ���� �޼ҵ带
//���� �Ѱ��� servlet �������̽��Դϴ�.
public class HelloWorld implements Servlet{
	ServletConfig config;
	//servlet �������̽��� ���ǵ� 5���� �޼ҵ���
	//�����ֱ⿡ ���õ� �޼ҵ�� init(),service().destroy()�Դϴ�.(���� ,���� ,�Ҹ�)
	
	
	@Override	//���� �����̳ʰ� ����ǰų� �ش� ������ ��Ȱ��ȭ ��ų�� ����
	public void destroy() {
		System.out.println("destroy() ȣ���");
	}
	@Override	//���� ���� ������ �ٷ�� servletConfig��ü ��ȯ
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override	//������ �ۼ��ѻ���� ����, ���� ����, �Ǹ�����
				//���� ���ڿ��� ��ȯ�մϴ�.
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override	//������ ������ �Ŀ� �ʱ�ȭ �۾��� ���� �����ϴ� �޼ҵ�
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() ȣ���");
		this.config=config;
	}
	@Override	//Ŭ���̾�Ʈ�� ��û�Ҷ����� ȣ��Ǵ� �޼ҵ��Դϴ�.
				//���������� ������ �ڵ带 ���� ���Դϴ�.
	public void service(ServletRequest req, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() ȣ���");
	}
	
}
