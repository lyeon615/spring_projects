package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVController {
	
	private static final Logger logger = LoggerFactory.getLogger(MVController.class);
	
	@RequestMapping("/reply")
	public ModelAndView reply() {
		logger.info("ModelAndView reply() run");
		
		ModelAndView mv = new ModelAndView();
		
		//addObject() key�� value�� ��Ƽ� ���� �� �ִ�.
		mv.addObject("id", 10);
		
		//setViewName() �� �̸� ����
		mv.setViewName("board/reply");		
		return mv;
	}
}
