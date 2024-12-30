package pageclasspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class Cart extends ChiccoSetup{
	
	
	public Cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath="/html/body/div[1]/header/div[3]/div/nav/ul[2]/li[3]/a[2]/img")
	WebElement cartIcon;
	
	@FindBy (id="8058664126125")
	WebElement plusButton;
	
	@FindBy (id="8059609734498")
	WebElement minusButton;
	
	public void viewCart()
	{
		cartIcon.click();
	}
	
	public void itemIncrease()
	{
		plusButton.click();
	}
	
	public void itemDecrease()
	{
		minusButton.click();
	}
	
	
	
	

	
}
