package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	

	@Before
	public void setUp() throws Exception {
		calculator=new Calculator();
	}

	@Test
	public void addTest() {

		int val=calculator.add(3, 3);
		Assert.assertEquals(6, val);
	}
	
	@Test
	public void divideTest() {
		int val=calculator.divide(7, 2);
		Assert.assertEquals(3, val);
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void divideByZeroTestThrowsEx() {
		int val=calculator.divide(7, 0);
		Assert.assertEquals(3, val);
	}
	
	
	@After
	public void tearDown() throws Exception {
		calculator=null;
	}


	
	

}
