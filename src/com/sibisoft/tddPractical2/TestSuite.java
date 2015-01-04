package com.sibisoft.tddPractical2;

import java.util.ArrayList;

public class TestSuite {

	private ArrayList tests;
	
	public TestSuite(){
		tests = new ArrayList();
	}
	public void addTest(WasRun test){
		tests.add(test);
	}
	public TestResult run(){
		TestResult testResult = new TestResult();
		for(int count = 0 ; count < tests.size() ; count ++){
			WasRun test = (WasRun) tests.get(count);
			test.run();
		}
		return testResult;
	}
}
