package chap02;

public class DI {
	public static void main(String[] args) {
		
		MemberDao memberDao = new CashedMemberDao();
		MemberVO member = null;
		MemberRegisterService rs = new MemberRegisterService();
		
		rs.delete(4,memberDao);
		rs.update(4,memberDao);
		try {
			rs.regist(member,memberDao);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
