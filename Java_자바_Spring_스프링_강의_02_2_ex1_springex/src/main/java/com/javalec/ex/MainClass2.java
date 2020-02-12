package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {

	public static void main(String[] args) {
		
	
		
		String configLocation = "classpath:appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		
	
	}
	
}
