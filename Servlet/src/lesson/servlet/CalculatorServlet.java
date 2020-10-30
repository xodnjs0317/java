package lesson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//GenericServlet�� Servlet �������̽��� �̸� ������
//Ŭ������, ���� ������ �ʿ䰡 ���� ���� ���� ���� �޼ҵ����
//�����ϰ� �ݵν� �����ؾ� �ϴ� service���� �����ϰ� �����
//���� Ŭ�����Դϴ�. ������ �޼ҵ���� ��Ȳ�� ���� �������� �ʾƵ� �������ϴ�.

//@WebServlet(urlPatterns="/calc");
//@WebServlet(urlPatterns="/calc",
//name ="Calculator);
@WebServlet("/calc")
public class CalculatorServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			int a = Integer.parseInt(request.getParameter("a"));
			int b = Integer.parseInt(request.getParameter("b"));
			
			response.setContentType("text/plain");
			//plain = ������ text
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			
			out.println("a="+a+","+"b="+"b�� ������Դϴ�.");
			out.println("a+b="+(a+b));
			out.println("a-b="+(a-b));
			out.println("a*b="+(a*b));
			out.println("a/b="+(a/b));
			out.println("a%b="+(a%b));
			
	}

}
