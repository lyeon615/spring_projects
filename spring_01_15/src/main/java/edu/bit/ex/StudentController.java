package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	/*
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping(value = "/studentForm")
	public String studentForm() {
		logger.info("studentForm() run");
		
		return "student/createPage";
	}
	
	@RequestMapping(value = "student/create")
	// BindingResult : validator�� ����ϱ� ���ؼ� �ʿ� 
	public String studentCreate(Student student, BindingResult result) {
		logger.info("studentForm() run");
		String page = "student/createDonePage";
		
		StudentValidator validator = new StudentValidator();
		
		// validate(Object obj, Errors errors) : Errors, BindingResult ������ ����
		validator.validate(student, result);
		
		if(result.hasErrors()) {
			page = "student/createPage";
		}
		return page;
	}
	*/
}
