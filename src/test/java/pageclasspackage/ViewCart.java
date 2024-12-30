package pageclasspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class ViewCart extends ChiccoSetup{
	
	public ViewCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="/html/body/div[1]/header/div[3]/div/nav/ul[2]/li[3]/a[2]/div/p")
	WebElement cartIcon;
	
	public void viewCartItems()
	{
		cartIcon.click();
	}
	
	
	
	
	

}
