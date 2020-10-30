package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.kedu.java01.spms.dao.MemberDAO;

@Controller
@RequestMapping("/member")
public class MemberListController implements SpmsController{
	
	MemberDAO memberDAO;
	
	@Autowired
	public MemberListController setMemberDAO
						(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
	}
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView execute() throws Exception {
		System.out.println("성공");
		ModelAndView mav = new ModelAndView("member/MemberList");
		
		mav.addObject("members",memberDAO.selectList()); //데이터 전달가능
		
		return mav;
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		
		model.put("members", memberDAO.selectList());
		return "/member/MemberList.jsp";
	}

	
	
}
