package spms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spms.util.ConnectionPool;

@SuppressWarnings("serial")
public class MemberUpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			ConnectionPool.getConnection();
			String sql = "select * from members + where no ="+request.getParameter("no");
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				rs.next();
				
				response.setContentType("text/html; charset=UTF=8");
				PrintWriter out = response.getWriter();
				out.println("<html><head><title>ȸ������</title></head>");
				out.println("<body><h1>ȸ������</h1>");
				out.println("<form action='update' method='post'>");
				out.println("��ȣ : <input type='text' name= 'no' value ='"+request.getParameter("no")+"'readonly><br>");
				out.println("�̸� : <input type='text' name ='name'"+"value='"+rs.getString("mname")+"'><br>");
				out.println("�̸��� : <input type='text' name ='email'"+"value='"+rs.getString("email")+"'><br>");
				out.println("������ : "+rs.getString("cre_date")+"<br>");
				out.println("<input type='submit' value='����'>");
				out.println("<input type='button' value='���'>"+"onclick='location.href=\"list\"'>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
	}
	

}
