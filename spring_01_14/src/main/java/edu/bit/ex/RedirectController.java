package edu.bit.ex;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	private static final Logger logger = LoggerFactory.getLogger(RedirectController.class);
	
	@RequestMapping("/redirect/studentConfirm")
	public String student(HttpServletRequest req, Model model) {
		logger.info("student() run, redirect");
		
		String id = req.getParameter("id");
		
		if(id.equals("abc")) {
			return "redirect:studentOk";
		}
		return "redirect:studentNg";
	}
	
	@RequestMapping("/redirect/studentOk")
	public String studentOk(Model model) {
			
		return "redirect/studentOk";
	}
	
	@RequestMapping("/redirect/studentNg")
	public String studentNg(Model model) {
		
		return "redirect/studentNg";
	}
}
