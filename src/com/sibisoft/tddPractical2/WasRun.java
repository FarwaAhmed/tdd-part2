package com.sibisoft.tddPractical2;

public class WasRun {

	/*@description : it is a TestCase class that indicates whether a test method was run or not*/
	private boolean wasRun;

	public WasRun(String testMethodName){
		this.wasRun = false;
	}
	
	public boolean wasRun() {
		return wasRun;
	}
	public void run(){
		testMethod();
	}
	public void testMethod(){
		this.wasRun=true;
	}
	/* For Debugging */
	public String toString() {
		return "wasRun =" + this.wasRun();
	}
}
