package pageclasspackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class SearchProduct extends ChiccoSetup{
	
	public SearchProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="q")
	WebElement searchField;
	
	
	public void searchBabyPowder()
	{
		searchField.sendKeys("baby powder",Keys.ENTER);
	}
	
	public void scrollDownToPriceCheckBox()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		//jse.executeScript("arguments[0].scrollIntoView", clickItemPowder);
	}
	
	
}
