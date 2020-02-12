package edu.bit.ex;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController2.class);
	
	@RequestMapping(value = "/studentForm")
	public String studentForm() {
		logger.info("studentForm() run");
		
		return "student/createPage";
	}
	
	@RequestMapping(value = "student/create")
	// @Valid ������̼� �̿��ؼ� @InitBinder�� ����
	public String studentCreate(@Valid Student student, BindingResult result) {
		logger.info("studentForm() run");
		String page = "student/createDonePage";
		
		//StudentValidator validator = new StudentValidator();
		//validator.validate(student, result);
		
		if(result.hasErrors()) {
			page = "student/createPage";
		}
		return page;
	}
	
	// ���� �ּ�ó���� �ڵ尡 �Ʒ��� ���� + @Valid �� ����.
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}
}
