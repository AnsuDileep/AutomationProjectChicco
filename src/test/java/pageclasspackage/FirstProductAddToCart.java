package pageclasspackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class FirstProductAddToCart extends ChiccoSetup {
	
	public FirstProductAddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[contains(@id,'pdpCarousel')]/div/div/div/img")
	WebElement firstItemBlue;
	
	@FindBy (id="add-to-cart")
	WebElement addToCartButton;
	
	public void windowHandle()
	{
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows)
		{
			driver.switchTo().window(window);
		}
	}
	
	public void firstItemClick()
	{
		firstItemBlue.click();
	}

	public void addToCart()
	{
		addToCartButton.click();
	}
}
