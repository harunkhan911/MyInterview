package ObjectRepository;

import org.openqa.selenium.By;

public class HomePageObjects {
	public By Continue_Bttn = By.xpath("//button[contains(text(),'Continue')]");
	public By EnterTDC_TextField = By.xpath("//input[@name='CaseCreateByUser']");
	public By Pin_TextField = By.xpath("(//input[@name='CaseCreateByUserPassword'])[2]");
	public By Next_Bttn = By.xpath("//i[@class='fa fa-arrow-right']");
}
