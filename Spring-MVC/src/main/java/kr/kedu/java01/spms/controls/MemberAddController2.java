package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.kedu.java01.spms.dao.MemberDAO;
import kr.kedu.java01.spms.vo.MemberVO;




@Controller
public class MemberAddController2 implements SpmsController {
	MemberDAO memberDAO;
	@Autowired
	public MemberAddController2 setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
	}
	@GetMapping("/member/add.do")
	public ModelAndView doGet() throws Exception {
		return new ModelAndView("/member/MemberForm");
	}
	@PostMapping("/member/add.do")
	public ModelAndView doPost(@RequestParam("name")String name
			, @RequestParam("email")String email
			, @RequestParam("password")String password) throws Exception {
		System.out.println("����");
		ModelAndView mav = new ModelAndView("redirect:/member/list.do");
		MemberVO member = new MemberVO().setEmail(email).setName(name).setPassword(password);
		memberDAO.insert(member);
		return mav; 
	}
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		if(model.get("member")==null){ //get��� ȣ��
			return "/member/MemberForm.jsp";
		}else {
			//MemberDAO memberDAO = (MemberDAO) model.get("memberDAO");
			MemberVO memberVO = (MemberVO) model.get("member");
			memberDAO.insert(memberVO);
			return "redirect:list.do";
		}
	}
	
}
