package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kedu.java01.spms.dao.MemberDAO;

public class LogOutController implements SpmsController{
	MemberDAO memberDAO;
	public LogOutController setMemberDAO
						(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
		
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		
		return "redirect:login.do";
	}

}
