package TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepository.HomePageObjects;
import ObjectRepository.LoginPageObjects;

public class LoginPageFunctionsTest extends MainDriver{
	
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	
	@Test
	public void LoginToApplication(String username, String password) {
		driver.findElement(loginPage.Username_TextField).sendKeys(username);
		driver.findElement(loginPage.password_TextField).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(loginPage.Login_Button).click();
		System.out.println("Application is logging In");
		
	}
}
