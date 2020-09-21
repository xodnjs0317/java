package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.ConnectionPool;

public class JdbcTest06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
			
			con.setAutoCommit(false);
			//setAutoCommit�� �Ű������� false�� �ٲ�� Ʈ������� ����Ҽ��ֽ��ϴ�.
			
			String sql = "update t_account" + " set money = money - ?"+" where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 30000);
			pstmt.setString(2, "id1");
			pstmt.executeUpdate();
			System.out.println("id1 ������� ���� ������Ʈ �Ϸ�");
			
			sql = "update t_account"+ " set money = money + ?"+" where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 30000);
			pstmt.setString(2, "id2");
			pstmt.executeUpdate();
			System.out.println("b ������� ���� ������Ʈ �Ϸ�");
			
			con.commit();
			
			
		} catch (Exception e) {
			try {
				con.rollback();
				//���ܰ� �߻��� ��� �ѹ���Ѽ� �����͸� �����·� �����ϴ�.
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			ConnectionPool.close(con);
		}
	}
}
