package Day01_10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RectangleMainClass2 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(RectangleAppConfig.class);
		
		Rectangle rec = ctx.getBean("rectangle", Rectangle.class);
		System.out.println("넓이 : " + rec.getArea());
	}
}
