package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionFactory {
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//1.����̹� �ε�
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection con = DriverManager.getConnection(url,"hr","hr");
		//2.����̹� �Ŵ����� ���� ���� ��ü ����
		return con;
	}
	
	public static void close(PreparedStatement pstmt, Connection con) {
		if(pstmt!=null) {
			try {
				pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
		if(con!=null) {
			try {
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	
	
}
