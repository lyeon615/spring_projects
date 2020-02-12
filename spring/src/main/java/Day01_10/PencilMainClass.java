package Day01_10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PencilMainClass {

	public static void main(String[] args) {
				
		String configLocation = "classpath:./Day01_10/appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		Pencil pencil = ctx.getBean("pencil4", Pencil.class);
		pencil.use();
		
		pencil = ctx.getBean("pencil6", Pencil.class);
		pencil.use();

		pencil = ctx.getBean("pencil6e", Pencil.class);
		pencil.use();
	}
}