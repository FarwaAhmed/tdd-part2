package com.sibisoft.tddPractical2;

public class TestCase {
	/*Instance variables*/
	private String testMethodName;
	
	/*Constructors*/
	public TestCase(String testMethodName){
		this.testMethodName = testMethodName;
	}
	
	/* getters/setters*/
	public String getTestMethodName() {
		return testMethodName;
	}
	public void setTestMethodName(String testMethodName) {
		this.testMethodName = testMethodName;
	}

	public String run(){
		return this.testMethodName;
	}
	/*public String testMethod(){
		return this.testMethodName;
	}*/
}
