package edu.bit.board.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator cal = new Calculator();
		int result = cal.sum(10, 20);
		assertEquals(30, result, 10);
	}
	
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int result = cal.sub(10, 20);
		assertEquals(0, result, 10);
	}

}
