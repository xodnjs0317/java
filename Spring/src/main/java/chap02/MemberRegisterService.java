package chap02;

public class MemberRegisterService {
	//�����ϴ� Ŭ������ ����ϴ� Ŭ������ �Ķ���ͷ� �޾Ƽ� ����ϴ� ���� ���� �����̶�� �մϴ�.
	//MemberRegisterService�� MemberDao�� �����ϰ� �ֽ��ϴ�.
	//���� = dependency
	//���� ���� = dependency injection(DI)
	
	private MemberDao memberDao = new MemberDao();
	
	public void regist(MemberVO memberVO, MemberDao memberDao) throws Exception{
		
		//�̸��Ϸ� ȸ�� ��ȸ
		MemberVO member = memberDao.selectByEmail();
		
		if(member != null) {
			//���� �̸����� ���� ȸ���� �����ϸ� �ͼ��� �߻�
			throw new Exception();
		}
		//���� �̸����� ���� ȸ���� �������� ������ db�� ����
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
