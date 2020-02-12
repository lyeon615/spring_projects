package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/*MyCalculation myCalculation = new MyCalculation();
		myCalculation.setCalculation(new Calculation());
		myCalculation.setFirstNum(10);
		myCalculation.setSecondNum(2);
		
		myCalculation.add();
		myCalculation.sub();
		myCalculation.mul();
		myCalculation.div();*/
		
		String configLocation = "classpath:appCTX.xml";
		//xml파일(설정파일)을 집어넣고 있다..
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyCalculation myCalculation = ctx.getBean("myCalculation", MyCalculation.class);
		
		myCalculation.add();
		myCalculation.sub();
		myCalculation.mul();
		myCalculation.div();
		
	}
	
}
