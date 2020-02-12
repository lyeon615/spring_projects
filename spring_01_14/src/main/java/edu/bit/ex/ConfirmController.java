package edu.bit.ex;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConfirmController {
	
	private static final Logger logger = LoggerFactory.getLogger(ConfirmController.class);
	
	//url경로는 다르지만 리턴하는 뷰 페이지가 같을 수 있다. but, 리퀘스트매핑이 겹칠 경우 예외가 발생한다.
	@RequestMapping("/confirm")
	//HttpServletRequest 클래스 이용해서 데이터 전송하기
	public String confirm(HttpServletRequest req, Model model) {
		logger.info("confirm() run");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board2/confirm";
	}

	@RequestMapping("/confirm2")
	//@RequestParam 어노테이션을 이용해서 데이터 전송하기
	public String confirm2(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		logger.info("confirm2() run");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board2/confirm";
	}
}
