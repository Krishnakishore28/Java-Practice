package com.wipro.Spring2;

public class Test {
	private String testId;
	private String testName;
	private String testMarks;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTestId() {
		return testId;
	}
	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestMarks() {
		return testMarks;
	}
	public void setTestMarks(String testMarks) {
		this.testMarks = testMarks;
	}
	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", testMarks=" + testMarks + "]";
	}
	
}
