package edu.bit.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		// 검증할 객체의 클래스 타입 정보, 공식이니까 외우자
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate() 함수 호출");
		Student student = (Student)obj;
		
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("student name is null or empty");
			// Validator 핵심코드 rejectValue(key, value)
			errors.rejectValue("name", "trouble");
		}
	
//		int studentId = student.getId();
//		if(studentId == 0) {
//			System.out.println("student id is 0");
//			errors.rejectValue("id", "trouble");
//		}
		
		// 위의 주석 처리된 코드와 동일한 기능, 코드가 조금 더 간략해진다.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "trouble");	
	}	
}
