package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.member.Member;

@Controller
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping("/member/join")
	public String join(Member member) {
		logger.info("join() run");
		
		return "member/join";
	}
}
