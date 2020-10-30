package MiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import util.ConnectionFactory;

public class MiniMainDAO2 {
	Scanner scanner = new Scanner(System.in);
	boolean run = true;
	
	void select() {//조회
		int i = 1;
		int j = 0;
		while(run){
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.드라이버 매니저를 통한 연결 객체 설정
			
			String sql = "select * from (select no, name, location, tel, rownum as rnum from "
					+ "(select * from minimain order by no asc)) "; 
			
			System.out.println("1.이전 	2.다음 	3.종료");
			
			
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			
			ResultSet rs = pstnt.executeQuery();
			while(rs.next()) { //true 혹은 false 반환
					int num = rs.getInt("no");
					String name = rs.getString("name");
					String location = rs.getString("location");
					String tel = rs.getString("tel");
					System.out.println(num+"\t"+name+"\t"+location+"\t"+tel);
					i++;
			}int no = scanner.nextInt();
			switch(no) {
			case 1 :  sql += "where rnum between i and 10 ";
						
						break;
			case 2 :  sql += "where rnum between i-10 and i-1 ";
						
						break;
						
			case 3 :  sql +="where rnum between 21 and 30 ";
						 
						break;
			}
			
					rs.close();
					pstnt.close();
					con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	public void insert() {
		 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1. 드라이버 로딩
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con= DriverManager.getConnection(url,"hr","hr");
			//2.DriverManager를 통해 Connection 객체생성
			
			Scanner sc = new Scanner(System.in);
			
			String sql = "insert into MiniMain(no, name, location, tel)";
			sql += "values(S2.nextVal,?,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.SQL문을 실행하고 스테이트 먼트를 얻어옴
			System.out.println("이름을 등록해주세요. : ");
			pstnt.setString(1, sc.nextLine());
			System.out.println("지역을 입력해주세요. :");
			pstnt.setString(2, sc.nextLine());
			System.out.println("전화번호를 입력해주세요 : ");
			pstnt.setString(3, sc.nextLine());
			
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
			
			String sql = "update MiniMain\n";
			
			scanner.nextLine();
			System.out.println("수정할 이름을 선택해주세요.");
			sql += "set name = '"+ scanner.nextLine();
			System.out.println("수정할 지역을 선택해주세요.");
			sql += "', location = '"+ scanner.nextLine();
			System.out.println("수정할 전화번호를 선택해주세요.");
			sql += "', tel = '"+ scanner.nextLine();
			System.out.println("수정할 번호를 선택해주세요.");
			sql += "' where no ="+ scanner.nextInt();
			
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
			
			String sql = "delete MiniMain";
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
	public void come() {
		System.out.println("메뉴를 선택해주세요.");
		System.out.println("-------------------------------");
		System.out.println("1.조회\t|2.추가\t|3.수정\t4.삭제");
		System.out.println("-------------------------------");
	}
}
