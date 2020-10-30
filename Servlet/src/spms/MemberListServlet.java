package spms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import spms.util.ConnectionPool;

@SuppressWarnings("serial")
@WebServlet("/member/list")
public class MemberListServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			Connection con = null;
			PreparedStatement pstmt=null;
			ResultSet rs =null;
			
		
		try {	
		con =ConnectionPool.getConnection();
		String sql = "select * from members ";
		sql+= "order by mno asc";
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>회원목록</title></head>");
		out.println("<body><h1>회원목록</h1>");
		out.println("<p><a href='add'>신규회원</a></p>");
		
		while(rs.next()) {
			int num = rs.getInt("mno");
			String name = rs.getString("mname");
			String email = rs.getString("email");
			String cre_date = rs.getString("cre_date");
			
			out.println(num+", <a href='update?no="+num+"'>"+name+"</a> ,"+email+","+cre_date+"<br>");
			//보낼정보를 get방식으로 num을 받는다. 
		}
		out.print("</body></html>");
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("닫기 시도");
	
				try {if(rs !=null)
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {if(pstmt !=null)
						pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			 if(con !=null) ConnectionPool.close(con);	
		}
		
	}
	
	
}
