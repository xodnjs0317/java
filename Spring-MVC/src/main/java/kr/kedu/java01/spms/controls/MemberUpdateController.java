package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kedu.java01.spms.dao.MemberDAO;
import kr.kedu.java01.spms.vo.MemberVO;

public class MemberUpdateController implements SpmsController{
	MemberDAO memberDAO;
	
	public MemberUpdateController setMemberDAO
						(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
		
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		if(model.get("member")==null) {
			model.put("member", memberDAO.selectOne((Integer)model.get("no")));
						
			return "/member/MemberUpdateForm.jsp";
		}else {
			
			MemberVO member = (MemberVO) model.get("member");
			int i = memberDAO.update(member);
			System.out.println(i+"�� �� ���� �Ϸ�");	
			return "redirect:list.do";
			
		}
		
		
		
	}

}
