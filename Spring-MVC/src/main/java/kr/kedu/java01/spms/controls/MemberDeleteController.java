package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kedu.java01.spms.dao.MemberDAO;

public class MemberDeleteController implements SpmsController{
	MemberDAO memberDAO;
	
	public MemberDeleteController setMemberDAO
						(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
		
	}
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		int i = memberDAO.delete((Integer)model.get("no"));
		System.out.println(i+"�� �� ���� �Ϸ�");	
		return "redirect:list.do";
	}

}
