package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@RequestMapping("/content")
	public String content(Model model) {
		logger.info("/board/content run");
		
		int id = 30;
		model.addAttribute("id", id);
		
		return "/board/content";
	}
}
