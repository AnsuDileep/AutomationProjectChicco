package pageclasspackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class Wishlist extends ChiccoSetup{
	
	public Wishlist(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="Wishlist")
	WebElement wishList;
	
	@FindBy (linkText="Baby Talcum Powder (300g)")
	WebElement clickItemPowder;
	
	@FindBy (id="add")
	WebElement plusButton;
	
	@FindBy (id="add-to-cart")
	WebElement addToCartbutton;
	
	@FindBy (xpath="//div[@id='navbarNav']/ul/li[6]/a")
	WebElement mouseHoverFashionLink;
	
	@FindBy (linkText="Girls")
	WebElement mouseHoverGirls;
	
	@FindBy (linkText="Kid Accessories")
	WebElement mouseHoverKidAccessories;
	
	@FindBy (linkText="Bags")
	WebElement bagItem;
	
	@FindBy (xpath="//*[@id=\"maincontent\"]/section[2]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/div[2]/a[1]/span/i")
	WebElement wishlistButton;
	
	//@FindBy (xpath="//*[contains(@class,'mobile_carts d-inline-block')]/a[2]/img")
	@FindBy (xpath="/html/body/div[1]/header/div[3]/div/nav/ul[2]/li[2]/a/img")
	WebElement viewWishlist;
	
	@FindBy (id="add-to-cart")
	WebElement addToCartButton;
	
	
	public void clickPowder()
	{
		clickItemPowder.click();
	}

	
	public void windowHandle()
	{
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows)
		{
			driver.switchTo().window(window);
		}
	}
	
	public void addItem()
	{
		plusButton.click();
		//wishList.click();
	}
	public void scroll()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
	}
	
	public void addToCart()
	{
		addToCartbutton.click();
	}
	
	
	
	public void scrollUp()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-500)");
	}
	

	
	
	
	public void mouseHoverFashion()
	{
		
		Actions action=new Actions(driver);
		action.moveToElement(mouseHoverFashionLink).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		action.moveToElement(mouseHoverGirls).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		action.moveToElement(mouseHoverKidAccessories).perform();
		bagItem.click();
		
		
		
	}
	
	public void wishList()
	{
		wishlistButton.click();
		viewWishlist.click();
	}
	
	public void addWishListToCart()
	{
		addToCartButton.click();
	}
	
		
	
}
