package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import util.ConnectionFactory;

public class t_boardDAO {
		
	
	void select() {//조회
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.드라이버 매니저를 통한 연결 객체 설정
			
			String sql = "select no, title, writer, ";
			sql += "to_char(reg_date,'yyyy-mm-dd') as regDate ";
			sql += "from t_board ";
			sql += "order by no asc ";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			
			ResultSet rs = pstnt.executeQuery();
			while(rs.next()) { //true 혹은 false 반환
					int num = rs.getInt("no");
					String title = rs.getString("title");
					String writer = rs.getString("writer");
					String regDate = rs.getString("regDate");
					System.out.println(num+"\t"+title+"\t"+writer+"\t"+regDate);
			}
					rs.close();
					pstnt.close();
					con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void insert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1. 드라이버 로딩
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con= DriverManager.getConnection(url,"hr","hr");
			//2.DriverManager를 통해 Connection 객체생성
			
			Scanner sc = new Scanner(System.in);
			
			String sql = "insert into t_board(no, title, writer)";
			sql += "values(seq_t_board_no.nextVal,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.SQL문을 실행하고 스테이트 먼트를 얻어옴
			System.out.println("제목을 입력하세요 : ");
			pstnt.setString(1, sc.nextLine());
			System.out.println("저자를 입력하세요 :");
			pstnt.setString(2, sc.nextLine());
			
			int cnt = pstnt.executeUpdate();
			//4.SQL문을 실행 후 처리
			System.out.println(cnt + "개의 행이 추가되었습니다.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void update() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.드라이버 로딩
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.드라이버 매니저를 통한 연결 객체 설정
			
			String sql = "update t_board\n";
			sql += "set title = '타이틀',writer = '이태원'";
			sql += "where no = 30";
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.SQL을 실행하고 스테이트먼트를 얻어옴
			
			int cnt = pstnt.executeUpdate();
			System.out.println(cnt + "개의 행이 변경되었습니다.");
			//4.SQL문 실행 후 처리
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	void delete() {
		Connection con = null;
		PreparedStatement pstmt =null;
		
		try {
			con = ConnectionFactory.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 게시물 번호 :");
					int no =sc.nextInt();
			
			String sql = "delete t_board";
			sql += " where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"개의 행이 변경 되었습니다.");
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close(pstmt, con);
		}
}
	
}
