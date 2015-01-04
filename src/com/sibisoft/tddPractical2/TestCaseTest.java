package com.sibisoft.tddPractical2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {

	public WasRun setUp() {
		return new WasRun("testMethod");
	}
	
	@Test
	public void testRunning() {
		WasRun test = setUp();
		//System.out.print(test.toString());
		//assertFalse(test.wasRun());
		
		test.run();
		//System.out.print(test.toString());
		assertEquals("setUp testMethod",test.getLog());
	}
	
	@Test
	public void testSetup() {
		WasRun test = setUp();
		test.run();
		assertTrue(test.wasSetUp());
	}

}
