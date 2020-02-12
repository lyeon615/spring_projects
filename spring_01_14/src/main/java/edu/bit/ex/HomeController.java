package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Spring MVC�� Controller Ŭ���� ���� �ܼ�ȭ
@Controller
//RequestMapping() Ŭ������ ������ ��� �޼ҵ忡 ������ �Ͱ� ��������.
//�Ʒ� ���� ��� ex/board/write ��η� ���� �ȴ�.
@RequestMapping("/board")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/write")
	public String write(Model model) {
		logger.info("write() run");
		
		model.addAttribute("id", 20);
		
		return "board/write";
	}
}
