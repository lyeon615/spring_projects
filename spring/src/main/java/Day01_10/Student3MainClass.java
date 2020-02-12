package Day01_10;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Student3MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext();
		ctx.load("classpath:./Day01_10/appCTX3.xml");
		
		System.out.println("before ctx.refresh()");
		ctx.refresh();
		System.out.println("after ctx.refresh()");

		System.out.println();
		
		System.out.println("before ctx.close()");
		ctx.close();
		System.out.println("after ctx.close()");
	}
}
