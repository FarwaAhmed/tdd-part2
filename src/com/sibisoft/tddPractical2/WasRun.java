package com.sibisoft.tddPractical2;

public class WasRun extends TestCase{

	/*@description : it is a TestCase class that indicates whether a test method was run or not*/
	private boolean wasRun;
	private boolean wasSetUp;
	
	public WasRun(String testMethodName){
		super(testMethodName);
		this.wasRun = false;
		this.wasSetUp = false;
	}
	
	/*setters*/
	public void setUp() {
		// if calling object is of type wasRun, it will call this method instead of base class method
		this.wasRun = false;
		this.wasSetUp = true; 
	}
	
	/*getters*/
	public boolean wasRun() {
		return wasRun;
	}
	public boolean wasSetUp() {
		return wasSetUp;
	}
	
	public String testMethod(){
		System.out.print("\n inside test method. testing reflection...  yes it works");
		wasRun = true;
		return "yes! "+this.getTestMethodName()+" ran";
	}
	
	/* For Debugging */
	public String toString() {
		return "\n wasRun = " + this.wasRun();
	}
}
