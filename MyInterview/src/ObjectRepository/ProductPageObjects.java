package ObjectRepository;

import org.openqa.selenium.By;

public class ProductPageObjects {
	public By AdvancedSearch_Bttn = By.xpath("//a[contains(text(),'Advanced Search')]");
	public By ProductGroup_DDN = By.xpath("//select[@name='ProductUserInputSolvupGroup']");
	public By ProductBrand_DDN = By.xpath("//select[@name='ProductUserInputSolvupBrand']");
	public By Next_Bttn = By.xpath("//i[@class='fa fa-arrow-right']");
	public By Search_Bttn = By.xpath("(//div[@class='ng-invalid ng-touched ng-dirty']/button)[2]");
	public By SearchResult_RadioBttn = By.xpath("(//span[contains(text(),'Fitness')]//ancestor::tr/td)[1]");
}
