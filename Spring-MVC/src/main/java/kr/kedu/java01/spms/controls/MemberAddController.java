package kr.kedu.java01.spms.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.kedu.java01.spms.dao.MemberDAO;
import kr.kedu.java01.spms.vo.MemberVO;

@Controller
public class MemberAddController implements SpmsController{
	MemberDAO memberDAO;
	
	@Autowired
	public MemberAddController setMemberDAO
						(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
		return this;
		
	}
	@GetMapping("/member/add.do")
	public ModelAndView doGet() throws Exception {
		return new ModelAndView("/member/MemberForm");
	}
	

	@PostMapping("/member/add.do")
	public ModelAndView doPost(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password) throws Exception {
		System.out.println(email);
		ModelAndView mav = new ModelAndView("redirect:/member/list.do");
		
		MemberVO member = new MemberVO().setEmail(email).setName(name).setPassword(password);
		memberDAO.insert(member);
		
		return mav;
	}

	public String execute(Map<String, Object> model) throws Exception {
	
			return null;
			
		
	}

}
