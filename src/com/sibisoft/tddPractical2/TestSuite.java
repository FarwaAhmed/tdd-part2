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
	public void run(TestResult testResult){
		for(int count = 0 ; count < tests.size() ; count ++){
			WasRun test = (WasRun) tests.get(count);
			test.run(testResult);
		}
	}
}
