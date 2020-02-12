package Day01_10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RectangleAppConfig {
	
	@Bean
	public Rectangle rectangle() {
		
		Rectangle rectangle = new Rectangle(4, 7);
		
		return rectangle;
	}
	
}
