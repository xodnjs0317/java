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

	//get 방식으로 실행되는 경우
	//1.웹 브라우저 주소창에 URL을 입력한수 엔터를 누를때
	//2. a 태그로 만들어진 링크를 누를 때
	//3. form의 메소드가 get이거나 생략된경우
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>회원가입</title></head>");
		out.println("<body><h1>회원등록</h1>");
		out.println("<form action='add' method='post'>");
		out.println("이름 : <input type='text' name='name'><br>");
		out.println("이메일 : <input type='text' name='email'><br>");
		out.println("암호 : <input type='password' name='password'><br>");
		out.println("<input type='submit' value='추가'>");
		out.println("<input type='reset' value='취소'><br>");
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
			//out.println("<html><head><title>회원등록결과</title>");
				//	+ "<meta http-equiv='Refresh' content='2;url=list'></head>");		//refresh 직접입력방법
			//out.println("<body><p>등록 성공!</p></body></html>");
			
			//response.addHeader("Refresh", "1;url=list");		//refresh를 하는경우 1초후 리스트로 이동
			//2초후에 지정된 url로리 프레시합니다.
			
			response.sendRedirect("list");	//회원가입후 리스트로 바로 넘어간다.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {if(pstmt!=null)
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(con!=null)ConnectionPool.close(con);	// if (con!=null)하는경우 남아있는이 줄어들지 않는다.
		}
	}
	
}
