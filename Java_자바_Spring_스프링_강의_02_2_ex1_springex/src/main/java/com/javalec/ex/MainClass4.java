package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass4 {

	public static void main(String[] args) {
		
	
		
		String configLocation = "classpath:appCTX4.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyGrade myGrade = ctx.getBean("myGrade", MyGrade.class);
		myGrade.myGrade();

	}
	
}
