package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kedu.java01.spms.dao.MemberDAO;
import kr.kedu.java01.spms.vo.MemberVO;

public class LogInController implements SpmsController{
	MemberDAO memberDAO;
	public LogInController setMemberDAO
						(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
	}
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		if(model.get("email")==null) {
			return "/auth/LogInForm.jsp";
		}else {
			MemberVO member = memberDAO.exist((String)model.get("email"), 
					(String)model.get("password"));
			if(member != null) {
				model.put("session", member );
				return "redirect:../member/list.do";
			}else {
				return "/auth/LogInFail.jsp";
			}
		}
	}

}
