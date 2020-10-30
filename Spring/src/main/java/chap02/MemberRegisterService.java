package chap02;

public class MemberRegisterService {
	//의존하는 클래스를 사용하는 클래스가 파라매터로 받아서 사용하는 것을 의존 주입이라고 합니다.
	//MemberRegisterService는 MemberDao에 의존하고 있습니다.
	//의존 = dependency
	//의존 주입 = dependency injection(DI)
	
	private MemberDao memberDao = new MemberDao();
	
	public void regist(MemberVO memberVO, MemberDao memberDao) throws Exception{
		
		//이메일로 회원 조회
		MemberVO member = memberDao.selectByEmail();
		
		if(member != null) {
			//같은 이메일을 가진 회원이 존재하면 익셉션 발생
			throw new Exception();
		}
		//같은 이메일을 가진 회원이 존재하지 않으면 db에 삽입
		memberDao.insert(memberVO);
	}
	public void delete(int no,MemberDao memberDao) {
		
		//MemberDao memberDao = new MemberDao();
		MemberDao memberDao1 = new CashedMemberDao();
	}
	public void update(int no,MemberDao memberDao) {
		//MemberDao memberDao = new MemberDao();
		MemberDao memberDao2 = new CashedMemberDao();
	}
	
}
