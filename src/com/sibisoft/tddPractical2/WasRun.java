package com.sibisoft.tddPractical2;

public class WasRun extends TestCase{

	/*@description : it is a TestCase class that indicates whether a test method was run or not*/
	private boolean wasRun;
	
	public WasRun(String testMethodName){
		super(testMethodName);
		this.wasRun = false;
	}
	
	public boolean wasRun() {
		return wasRun;
	}
	
	/* For Debugging */
	public String toString() {
		return "\n wasRun = " + this.wasRun();
	}
}
