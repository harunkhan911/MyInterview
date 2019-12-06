package FunctionLibrary;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import ObjectRepository.HomePageObjects;
import ObjectRepository.LoginPageObjects;
import ObjectRepository.ProductPageObjects;
import TestCase.MainDriver;

public class WebDriverInstance extends MainDriver{
	
	//protected WebDriver driver;
	LoginPageObjects loginPage = new LoginPageObjects();
	HomePageObjects homePage = new HomePageObjects();
	ProductPageObjects productPage = new ProductPageObjects();
	
	
	@Test
	public void LoginToApplication(String baseurl, String username, String password) {
	MainDriver.CreateInstance();
		System.out.println("inside Browser details");
		System.out.println("\nThe application url is :- " + baseurl);
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt("30"), TimeUnit.SECONDS);
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
	@Test
	public void verifyHomePage() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("Waiting for the application to load");
		driver.findElement(homePage.Continue_Bttn).click();
		Thread.sleep(10000);
		if (driver.findElement(homePage.EnterTDC_TextField).isDisplayed() == true)
			;
		{
			System.out.println("Yeaahh,,,!!! We are on Home page");
		}
	}
	
	public void fillFormData(String TDC, String PIN) throws InterruptedException {
		//MainDriver.CreateInstance();
		System.out.println("Waiting for the page to load");


		driver.findElement(homePage.EnterTDC_TextField).sendKeys(TDC);
		driver.findElement(homePage.Pin_TextField).sendKeys(PIN);
		driver.findElement(homePage.Next_Bttn).click();
		Thread.sleep(10000);
		System.out.println("Waiting for the page to load completely");

	}

	public void ProductSearchPage() throws InterruptedException {
		System.out.println("inside Product Tab screen");
		driver.findElement(productPage.AdvancedSearch_Bttn).click();
		System.out.println("Yeah,,!!! We are searching for product");
		//SelectDropDownByValue(productPage.ProductGroup_DDN, "Fitness");
		Select sel = new Select(driver.findElement(productPage.ProductGroup_DDN));
        sel.selectByVisibleText("Fitness");
        Thread.sleep(5000);
        Select sel1 = new Select(driver.findElement(productPage.ProductBrand_DDN));
        sel1.selectByVisibleText("Casio");
        
        driver.findElement(productPage.Search_Bttn).click();
        driver.findElement(productPage.SearchResult_RadioBttn).click();
        driver.findElement(productPage.Next_Bttn).click();
	}
	
	public void openBrowser(String URL) {
		System.setProperty("webdriver.chrome.driver", "C://Users/hkhan/Downloads/chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	}
	
	public void SelectDropDownByValue(WebElement element, String valueToBeSelected) {
		
		Select sel = new Select(element);
        sel.selectByVisibleText(valueToBeSelected);
        
	}
	
	
	
	
	public void loginToApp() {
		
	}

}
