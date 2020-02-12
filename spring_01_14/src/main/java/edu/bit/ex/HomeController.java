package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Spring MVC의 Controller 클래스 선언 단순화
@Controller
//RequestMapping() 클래스에 적용할 경우 메소드에 적용한 것과 더해진다.
//아래 같은 경우 ex/board/write 경로로 들어가게 된다.
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
