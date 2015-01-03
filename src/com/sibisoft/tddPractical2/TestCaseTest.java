package com.sibisoft.tddPractical2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {

	@Test
	public void testRunning() {
		WasRun test= new WasRun("testMethod");
		System.out.print(test.toString());
		assertFalse(test.wasRun());
		
		test.run();
		System.out.print(test.toString());
		assertTrue(test.wasRun());
	}

}
