package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass3 {

	public static void main(String[] args) {
		
	
		
		String configLocation = "classpath:appCTX3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyCircle circle = ctx.getBean("circle", MyCircle.class);
		circle.circle();
		circle.square();
		circle.triangle();
		
		
		circle.setRadius(10);
		circle.circle();

	}
	
}
