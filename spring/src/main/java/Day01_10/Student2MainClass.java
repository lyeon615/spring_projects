package Day01_10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Student2MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student2 student = ctx.getBean("student1", Student2.class);
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		System.out.println("취미 : " + student.getHobbys());
		System.out.println("신장 : " + student.getHeight());
		System.out.println("몸무게 : " + student.getWeight());
		
		System.out.println();
		
		Student2 student2 = ctx.getBean("student2", Student2.class);
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		System.out.println("취미 : " + student2.getHobbys());
		System.out.println("신장 : " + student2.getHeight());
		System.out.println("몸무게 : " + student2.getWeight());
	}
}
