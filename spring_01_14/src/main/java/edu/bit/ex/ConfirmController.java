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
	
	//url��δ� �ٸ����� �����ϴ� �� �������� ���� �� �ִ�. but, ������Ʈ������ ��ĥ ��� ���ܰ� �߻��Ѵ�.
	@RequestMapping("/confirm")
	//HttpServletRequest Ŭ���� �̿��ؼ� ������ �����ϱ�
	public String confirm(HttpServletRequest req, Model model) {
		logger.info("confirm() run");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board2/confirm";
	}

	@RequestMapping("/confirm2")
	//@RequestParam ������̼��� �̿��ؼ� ������ �����ϱ�
	public String confirm2(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		logger.info("confirm2() run");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board2/confirm";
	}
}
