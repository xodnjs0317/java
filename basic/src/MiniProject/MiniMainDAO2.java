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
	
	void select() {//��ȸ
		int i = 1;
		int j = 0;
		while(run){
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con = DriverManager.getConnection(url,"hr","hr");
			//2.����̹� �Ŵ����� ���� ���� ��ü ����
			
			String sql = "select * from (select no, name, location, tel, rownum as rnum from "
					+ "(select * from minimain order by no asc)) "; 
			
			System.out.println("1.���� 	2.���� 	3.����");
			
			
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			
			ResultSet rs = pstnt.executeQuery();
			while(rs.next()) { //true Ȥ�� false ��ȯ
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
			//1. ����̹� �ε�
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection con= DriverManager.getConnection(url,"hr","hr");
			//2.DriverManager�� ���� Connection ��ü����
			
			Scanner sc = new Scanner(System.in);
			
			String sql = "insert into MiniMain(no, name, location, tel)";
			sql += "values(S2.nextVal,?,?,?)";
			
			PreparedStatement pstnt = con.prepareStatement(sql);
			//3.SQL���� �����ϰ� ������Ʈ ��Ʈ�� ����
			System.out.println("�̸��� ������ּ���. : ");
			pstnt.setString(1, sc.nextLine());
			System.out.println("������ �Է����ּ���. :");
			pstnt.setString(2, sc.nextLine());
			System.out.println("��ȭ��ȣ�� �Է����ּ��� : ");
			pstnt.setString(3, sc.nextLine());
			
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
			
			String sql = "update MiniMain\n";
			
			scanner.nextLine();
			System.out.println("������ �̸��� �������ּ���.");
			sql += "set name = '"+ scanner.nextLine();
			System.out.println("������ ������ �������ּ���.");
			sql += "', location = '"+ scanner.nextLine();
			System.out.println("������ ��ȭ��ȣ�� �������ּ���.");
			sql += "', tel = '"+ scanner.nextLine();
			System.out.println("������ ��ȣ�� �������ּ���.");
			sql += "' where no ="+ scanner.nextInt();
			
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
			
			String sql = "delete MiniMain";
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
	public void come() {
		System.out.println("�޴��� �������ּ���.");
		System.out.println("-------------------------------");
		System.out.println("1.��ȸ\t|2.�߰�\t|3.����\t4.����");
		System.out.println("-------------------------------");
	}
}
