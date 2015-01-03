package com.sibisoft.tddPractical2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTest {

	@Test
	public void testRunning() {
		WasRun test= new WasRun("testMethod");
		assertFalse(test.wasRun());
		test.run();
		assertTrue(test.wasRun());
	}

}
