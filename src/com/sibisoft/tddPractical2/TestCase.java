package com.sibisoft.tddPractical2;

import java.lang.reflect.Method;

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

	public TestResult run(TestResult testResult){
		// TestResult testResult = new TestResult();
		//System.out.print("\n test started");
		testResult.testStarted();
		setUp();
		
		try{
			//toDefineReflection();
			Method method = this.getClass().getMethod(testMethodName);
			method.invoke(this);
		}
		catch(Exception exp){
			exp.getMessage();
			testResult.testFailed();
		}
		tearDown();
		return testResult;
	}
	
	public void setUp() {
		// pass: In python : The pass statement does nothing. It can be used when a statement is required syntactically but the program requires no action
	}
	public void tearDown() {
		// pass: In python : The pass statement does nothing. It can be used when a statement is required syntactically but the program requires no action
	}
	
	/* For Learning purpose */
	public void toDefineReflection() {
		String defineReflection = 
				"\n The name reflection is used to describe code which is able to inspect other code in the same system (or itself)." +
				"\n For example, say you have an object of an unknown type in Java, and you would like to call a 'doSomething' method on it if one exists."+
				"\n Java's static typing system isn't really designed to support this unless the object conforms to a known interface, but using reflection,"+
				"\n your code can look at the object and find out if it has a method called 'doSomething' and then call it if you want to."+
				"\n So, to give a code example of this in Java (imagine the object in question is foo) :"+
				"\n Method method = foo.getClass().getMethod('doSomething', null);"+
				"\n method.invoke(foo, null);";
		System.out.print(defineReflection);
	}

}
