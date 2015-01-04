package com.sibisoft.tddPractical2;

public class WasRun extends TestCase{

	/*@description : it is a TestCase class that indicates whether a test method was run or not*/
	//private boolean wasRun;
	//private boolean wasSetUp;
	private String log;
	
	public WasRun(String testMethodName){
		super(testMethodName);
		//this.wasRun = false;
		//this.wasSetUp = false;
	}
	
	/*setters*/
	public void setUp() {
		// if calling object is of type wasRun, it will call this method instead of base class method
		//this.wasRun = false;
		//this.wasSetUp = true; 
		this.log = "setUp ";
	}
	public void tearDown(){
		log = log + "tearDown ";
	}
	/*getters*/
	/*public boolean wasRun() {
		return wasRun;
	}
	public boolean wasSetUp() {
		return wasSetUp;
	}*/
	public String getLog() {
		return log;
	}
	
	public String testMethod(){
		// System.out.print("\n inside test method. testing reflection...  yes it works");
		//wasRun = true;
		log = log + "testMethod ";
		return "yes! "+this.getTestMethodName()+" ran";
	}
	
	public void testBrokenMethod()throws Exception{
		throw new Exception("within testBrokenMethod method");
	}
	
	/* For Debugging */
	public String toString() {
		return "\n wasRun = this.wasRun()" ;
	}
}
