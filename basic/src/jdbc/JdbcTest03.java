package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTest03 { //���� ������Ʈ
	public static void main(String[] args) {
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
}
