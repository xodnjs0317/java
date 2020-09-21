package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcTest02 {  //���Ӱ� �߰� insert
	public static void main(String[] args) {
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
}
