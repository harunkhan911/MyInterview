package FunctionLibrary;



import org.openqa.selenium.WebDriver;


import ObjectRepository.LoginPageObjects;

public class LoginPageFunctions  {
	protected WebDriver driver;

		/*
		 * ______________________________________________________ INSTANTIATE PAGE
		 * OBJECTS ACCORDING TO THE REQUIREMENT
		 * -----------------------------------------------------------------------
		 */

		LoginPageObjects loginPage = new LoginPageObjects();
		

		public void loginToApplicationWeb(String username, String password) {
			System.out.println("heer");
			
			driver.findElement(loginPage.Username_TextField).sendKeys(username);
			driver.findElement(loginPage.password_TextField).sendKeys(password);
			driver.findElement(loginPage.Login_Button);
			System.out.println("Entered credentials Successfully,,, Waiting for teh page to load...!!!!");
		}

			

	}

