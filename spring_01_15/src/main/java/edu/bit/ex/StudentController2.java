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
	// @Valid 어노테이션 이용해서 @InitBinder로 검증
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
	
	// 위의 주석처리한 코드가 아래의 내용 + @Valid 와 같다.
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}
}
