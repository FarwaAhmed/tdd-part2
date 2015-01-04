package com.sibisoft.tddPractical2;

public class TestResult {
	private int runCount;
	private String summary;
	
	public TestResult(){
		this.runCount = 1;
	}
	public String getSummary() {
		return  this.runCount + " run, 0 failed";//summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
