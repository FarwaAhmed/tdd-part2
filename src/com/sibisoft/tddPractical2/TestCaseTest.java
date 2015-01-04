package com.sibisoft.tddPractical2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {

	
	/*public WasRun setUp() {
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
	}*/

	@Test
	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run();
		assertEquals("setUp testMethod tearDown ",test.getLog());
	}
	
	@Test
	public void testResult() {
		WasRun test = new WasRun("testMethod");
		TestResult testResult = test.run();
		assertEquals("1 run, 0 failed",testResult.getSummary());
	}
	@Test
	public void testFailedResult() {
		try
		{
			WasRun test = new WasRun("testBrokenMethod"); 
			TestResult testResult = test.run();
			assertEquals("1 run, 1 failed",testResult.getSummary());
		} catch (Exception ex){
			fail("The test fails due to following reason: \n "+ ex.getMessage());
		}
	}
	
	@Test
	public void testFailedResultFormatting() {
		TestResult testResult = new TestResult();
		testResult.testStarted();
		testResult.testFailed();
		assertEquals("1 run, 1 failed",testResult.getSummary());
	}
}
