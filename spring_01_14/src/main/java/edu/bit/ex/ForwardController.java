package edu.bit.ex;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {
	
	private static final Logger logger = LoggerFactory.getLogger(ForwardController.class);
	
	@RequestMapping("/forward/studentConfirm")
	public String student(HttpServletRequest req, Model model) {
		logger.info("student() run, forward");
		
		
		String id = req.getParameter("id");
		
		if(id.equals("abc")) {
			return "forward:studentOk";
		}
		return "forward:studentNg";
	}
	@RequestMapping("/forward/studentOk")
	public String studentOk(Model model) {
				
		return "redirect/studentOk";
	}
	
	@RequestMapping("/forward/studentNg")
	public String studentNg(Model model) {
				
		return "redirect/studentNg";
	}
}
