package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void addTest(){
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void subtractTest(){
		assertEquals(5,calculator.subtract(10, 5));
	}
	
	@Test
	public void multiplyTest(){
		assertEquals(25, calculator.multiply(5, 5));
	}
	
	@Test
	public void divideTest(){
		assertEquals(2, calculator.divide(4, 2));
	}
	
	@Test
	public void isEqualTrueTest(){
		assertTrue(calculator.isEqual(3, 3));
	}
	
	@Test
	public void isEqualFalseTest(){
		assertFalse(calculator.isEqual(4, 2));
	}

}
