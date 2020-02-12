package edu.bit.ex;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.bit.ex.student.Student;

@Controller
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping("/student/index")
	public String index() {
		logger.info("index() run");
		
		return "student/index";
	}
	
	@RequestMapping(value="/student/student", method=RequestMethod.GET)
	public ModelAndView student(HttpServletRequest req) {
		logger.info("ModelAndView student() run, RequestMethod.GET");
		
		String id = req.getParameter("id");
		logger.info("id : "+ id);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		
		mv.setViewName("/student/student");		
		
		return mv;
	}
	
	@RequestMapping(value="/student/student", method=RequestMethod.POST)
	public String student(HttpServletRequest req, Model model) {
		logger.info("goStudent() run, RequestMethod.POST");
		
		String id = req.getParameter("id");
		logger.info("id : "+ id);
		
		model.addAttribute("id", id);
		
		return "student/student";
	}
}
