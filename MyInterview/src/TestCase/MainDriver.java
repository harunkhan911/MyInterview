package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainDriver {
public static WebDriver driver;
public static void CreateInstance() {
	System.setProperty("webdriver.chrome.driver", "C://Users/hkhan/Downloads/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	
}
}
