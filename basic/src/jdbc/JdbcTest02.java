package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest02 {  //새롭게 추가 insert
	public static void main(String[] args) {
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
}
