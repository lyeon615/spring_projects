package edu.bit.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		
		// ������ ��ü�� Ŭ���� Ÿ�� ����, �����̴ϱ� �ܿ���
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate() �Լ� ȣ��");
		Student student = (Student)obj;
		
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("student name is null or empty");
			// Validator �ٽ��ڵ� rejectValue(key, value)
			errors.rejectValue("name", "trouble");
		}
	
//		int studentId = student.getId();
//		if(studentId == 0) {
//			System.out.println("student id is 0");
//			errors.rejectValue("id", "trouble");
//		}
		
		// ���� �ּ� ó���� �ڵ�� ������ ���, �ڵ尡 ���� �� ����������.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "trouble");	
	}	
}
