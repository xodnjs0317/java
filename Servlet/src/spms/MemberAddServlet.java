package spms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.util.ConnectionPool;

@SuppressWarnings("serial")
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet{

	//get ������� ����Ǵ� ���
	//1.�� ������ �ּ�â�� URL�� �Է��Ѽ� ���͸� ������
	//2. a �±׷� ������� ��ũ�� ���� ��
	//3. form�� �޼ҵ尡 get�̰ų� �����Ȱ��
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>ȸ������</title></head>");
		out.println("<body><h1>ȸ�����</h1>");
		out.println("<form action='add' method='post'>");
		out.println("�̸� : <input type='text' name='name'><br>");
		out.println("�̸��� : <input type='text' name='email'><br>");
		out.println("��ȣ : <input type='password' name='password'><br>");
		out.println("<input type='submit' value='�߰�'>");
		out.println("<input type='reset' value='���'><br>");
		out.println("</form>");
		out.println("</body></html>");
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con =null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			String sql = "insert into members" + "(mno,email,pwd,mname) " + "values(seq_members_mno.nextval, "+"? ,? ,? ) " ;
			pstmt = con.prepareStatement(sql);
			request.setCharacterEncoding("UTF-8");
			
			
			pstmt.setString(1, request.getParameter("email"));
			pstmt.setString(2, request.getParameter("password"));
			pstmt.setString(3, request.getParameter("name"));
			pstmt.executeUpdate();
			
			//response.setContentType("text/html; charset=UTF-8");
			//PrintWriter out = response.getWriter();  
			//out.println("<html><head><title>ȸ����ϰ��</title>");
				//	+ "<meta http-equiv='Refresh' content='2;url=list'></head>");		//refresh �����Է¹��
			//out.println("<body><p>��� ����!</p></body></html>");
			
			//response.addHeader("Refresh", "1;url=list");		//refresh�� �ϴ°�� 1���� ����Ʈ�� �̵�
			//2���Ŀ� ������ url�θ� �������մϴ�.
			
			response.sendRedirect("list");	//ȸ�������� ����Ʈ�� �ٷ� �Ѿ��.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {if(pstmt!=null)
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(con!=null)ConnectionPool.close(con);	// if (con!=null)�ϴ°�� �����ִ��� �پ���� �ʴ´�.
		}
	}
	
}
