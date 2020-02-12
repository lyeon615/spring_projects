package Day01_10;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Student2 student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("swim");
		hobbys.add("cook");
		
		Student2 student = new Student2("kim", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
	
	@Bean
	public Student2 student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("swim");
		hobbys.add("run");
		
		Student2 student = new Student2("yang", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
}
