package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.����̹� �ε�
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//2.����̹� �Ŵ����� ���� ���� ��ü ���
			//(����Ŭ�� ����̹� �̸���thin/@�ּ�/��Ʈ��1521/�����ͺ��̽� �̸�)
			Connection con= DriverManager.getConnection(url,"hr","hr");
			//���̵�� ���
			System.out.println("���Ἲ�� : "+con);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//		D:\JAVA01\basic\lib
//		build path\	configure buildpath\libraies\ ojdbc6.jar =���� ����ֱ�
	}
}
