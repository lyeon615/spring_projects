package Day01_10;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Student4MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext();
		ctx.load("classpath:./Day01_10/appCTX4.xml");
		
		Student4 student1 = ctx.getBean("student", Student4.class);
		System.out.println("student1 name : " + student1.getName() + "\nstudent1 age : " + student1.getAge());
		
		Student4 student2 = ctx.getBean("student", Student4.class);
		System.out.println("student2 name : " + student2.getName() + "\nstudent2 age : " + student2.getAge());
		System.out.println();

		student2.setAge("100");
		student2.setName("hong");
		
		System.out.println("student1 name : " + student1.getName() + "\nstudent1 age : " + student1.getAge());
		System.out.println("student2 name : " + student2.getName() + "\nstudent2 age : " + student2.getAge());
		System.out.println();
		
		if(student1.equals(student2)) {
			System.out.println("singleton scope : student1 == student2 \n");
		} else {
			System.out.println("singleton scope : student1 != student2 \n");
		}
		
		Student4 student3 = ctx.getBean("studentP", Student4.class);
		System.out.println("student3 name : " + student3.getName() + "\nstudent3 age : " + student3.getAge());
		System.out.println();
		
		Student4 student4 = ctx.getBean("student", Student4.class);
		student4.setAge("100");
		student4.setName("hong");
		
		System.out.println("student3 name : " + student3.getName() + "\nstudent3 age : " + student3.getAge());
		System.out.println("student4 name : " + student4.getName() + "\nstudent4 age : " + student4.getAge());
		System.out.println();

		if(student3.equals(student4)) {
			System.out.println("prototype scope : student3 == student4 \n");
		} else {
			System.out.println("prototype scope : student3 != student4 \n");
		}
	}
}
