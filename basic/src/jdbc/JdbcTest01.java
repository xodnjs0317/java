package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1.드라이버 로딩
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//2.드라이버 매니저를 통한 연결 객체 얻기
			//(오라클의 드라이버 이름은thin/@주소/포트는1521/데이터베이스 이름)
			Connection con= DriverManager.getConnection(url,"hr","hr");
			//아이디와 비번
			System.out.println("연결성공 : "+con);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//		D:\JAVA01\basic\lib
//		build path\	configure buildpath\libraies\ ojdbc6.jar =직접 집어넣기
	}
}
