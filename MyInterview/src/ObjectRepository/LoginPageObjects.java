package ObjectRepository;

import org.openqa.selenium.By;

public class LoginPageObjects {
	public By Username_TextField = By.xpath("//label[contains(text(),'Store Code/Email')]/following-sibling::input");
	public By password_TextField = By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
	public By Login_Button = By.xpath("//button[contains(text(),'Login')]");
		
}
