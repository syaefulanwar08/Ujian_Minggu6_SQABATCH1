package sqademo.utils;

public enum TestCases {

	T1("Testing the authentication register"),
	T2("Testing the authentication login"),
	T3("Add to chart shoes and glass"),
	T4("Go to cart page until checkout");
	
	private String testName;

	private TestCases(String values) {
		// TODO Auto-generated constructor stub
		this.testName = values;
	}

	public String getTestName() {
		return testName;
	}
	
}
