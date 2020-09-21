package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import util.ConnectionFactory;

public class t_boardDAO {
		
	
	void select() {//��ȸ
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.����̹� �Ŵ����� ���� ���� ��ü ����
			
			String sql = "select no, title, writer, ";
			sql += "to_char(reg_date,'yyyy-mm-dd') as regDate ";
			sql += "from t_board ";
			sql += "order by no asc ";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			
			ResultSet rs = pstnt.executeQuery();
			while(rs.next()) { //true Ȥ�� false ��ȯ
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
			//1. ����̹� �ε�
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con= DriverManager.getConnection(url,"hr","hr");
			//2.DriverManager�� ���� Connection ��ü����
			
			Scanner sc = new Scanner(System.in);
			
			String sql = "insert into t_board(no, title, writer)";
			sql += "values(seq_t_board_no.nextVal,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.SQL���� �����ϰ� ������Ʈ ��Ʈ�� ����
			System.out.println("������ �Է��ϼ��� : ");
			pstnt.setString(1, sc.nextLine());
			System.out.println("���ڸ� �Է��ϼ��� :");
			pstnt.setString(2, sc.nextLine());
			
			int cnt = pstnt.executeUpdate();
			//4.SQL���� ���� �� ó��
			System.out.println(cnt + "���� ���� �߰��Ǿ����ϴ�.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void update() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.����̹� �ε�
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.����̹� �Ŵ����� ���� ���� ��ü ����
			
			String sql = "update t_board\n";
			sql += "set title = 'Ÿ��Ʋ',writer = '���¿�'";
			sql += "where no = 30";
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.SQL�� �����ϰ� ������Ʈ��Ʈ�� ����
			
			int cnt = pstnt.executeUpdate();
			System.out.println(cnt + "���� ���� ����Ǿ����ϴ�.");
			//4.SQL�� ���� �� ó��
			
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
			System.out.println("������ �Խù� ��ȣ :");
					int no =sc.nextInt();
			
			String sql = "delete t_board";
			sql += " where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt+"���� ���� ���� �Ǿ����ϴ�.");
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close(pstmt, con);
		}
}
	
}
