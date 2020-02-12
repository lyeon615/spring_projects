package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.student.Student;

@Controller
public class StudentController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController2.class);
	
	@RequestMapping("/student/index2")
	public String index2() {
		logger.info("index2() run");
		
		return "student/index2";
	}
	
	@RequestMapping("/student/studentView")
	public String studentView(@ModelAttribute("studentInfo") Student stundetInformation) {
		
		logger.info("studentView() run");
		
		return "student/studentView";
	}
}
