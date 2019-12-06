package FunctionLibrary;

import org.openqa.selenium.WebDriver;

import ObjectRepository.HomePageObjects;
import ObjectRepository.LoginPageObjects;

public class HomePageFunctions {
	public WebDriver driver;
	HomePageObjects homePage = new HomePageObjects();

	public void verifyHomePage() {
		if (driver.findElement(homePage.Continue_Bttn).isDisplayed() == true)
			;
		{
			driver.findElement(homePage.Continue_Bttn).click();
		}
		if (driver.findElement(homePage.EnterTDC_TextField).isDisplayed() == true)
			;
		{
			System.out.println("Yeaahh,,,!!! We are on Home page");
		}
	}

	public void fillFormData(String TDC, String PIN) {
		System.out.println("Waiting for the page to load");

		if (driver.findElement(homePage.Continue_Bttn).isDisplayed() == true)
			;
		{
			driver.findElement(homePage.Continue_Bttn).click();
		}

		driver.findElement(homePage.EnterTDC_TextField).sendKeys(TDC);
		driver.findElement(homePage.Pin_TextField).sendKeys(PIN);
		driver.findElement(homePage.Next_Bttn).click();

	}
}
