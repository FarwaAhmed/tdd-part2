package com.sibisoft.tddPractical2;

import static org.junit.Assert.*;

import com.sibisoft.tddPractical2.TestSuite;

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

	private TestResult testResult;

    public void setUp() {
    	testResult = new TestResult();
	}
    
    @Test
	public void testTemplateMethod() {
    	setUp();// if running tests individually, if running in suite, u won't need it
		WasRun test = new WasRun("testMethod");
		test.run(testResult);
		assertEquals("setUp testMethod tearDown ",test.getLog());
	}
	@Test
	public void testResult() {
		setUp();// if running tests individually
		WasRun test = new WasRun("testMethod");
		test.run(testResult);
		assertEquals("1 run, 0 failed",testResult.getSummary());
	}
	
	@Test
	public void testFailedResult() {
		try
		{
			setUp();// if running tests individually, if running in suite, u won't need it
			WasRun test = new WasRun("testBrokenMethod"); 
			test.run(testResult);
			assertEquals("1 run, 1 failed",testResult.getSummary());
		} catch (Exception ex){
			fail("The test fails due to following reason: \n "+ ex.getMessage());
		}
	}
	
	@Test
	public void testFailedResultFormatting() {
		setUp();// if running tests individually, if running in suite, u won't need it
		testResult.testStarted();
		testResult.testFailed();
		assertEquals("1 run, 1 failed",testResult.getSummary());
	}
	
	@Test
	public void testSuite() {
		setUp(); // if running tests individually, if running in suite, u won't need it
		TestSuite suite = new TestSuite();
		suite.addTest(new WasRun("testMethod"));
		suite.addTest(new WasRun("testBrokenMethod"));
		
		suite.run(testResult);
		assertEquals("2 run, 1 failed",testResult.getSummary());
	}
	
	@Test
	public void main() {
		setUp();
		TestSuite suite = new TestSuite();
		suite.addTest(new WasRun("testTemplateMethod"));
		suite.addTest(new WasRun("testResult"));
		suite.addTest(new WasRun("testFailedResult"));
		suite.addTest(new WasRun("testFailedResultFormatting"));
		suite.addTest(new WasRun("testSuite"));
		
		suite.run(testResult);
		//System.out.print(testResult.getSummary());
		//assertEquals("2 run, 1 failed",testResult.getSummary());
	}
}
