package TestCase;

import org.testng.annotations.Test;


import FunctionLibrary.HomePageFunctions;

import FunctionLibrary.WebDriverInstance;

public class MyInterviewTestCase1 extends MainDriver {

	static WebDriverInstance instance = new WebDriverInstance();
	static LoginPageFunctionsTest loginToApp = new LoginPageFunctionsTest();
	static HomePageFunctions FillForm = new HomePageFunctions();
	//TestDataHandler testData = new TestDataHandler();
	
	@Test
	public void MyTest() throws InterruptedException {
		// driver.get(baseurl);
		instance.LoginToApplication("https://staging-apps.solvup.com", "JB0002", "pass");
		instance.verifyHomePage();
		instance.fillFormData("12345", "pass");
		instance.ProductSearchPage();

	}
}
