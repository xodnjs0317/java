package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTest03 { //변경 업데이트
	public static void main(String[] args) {
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
}
