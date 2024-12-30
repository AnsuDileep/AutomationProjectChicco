package pageclasspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class TitleVerification extends ChiccoSetup {
	
	String expTitle;
	
	
	
	public TitleVerification(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void titleVerify()
	{
		expTitle="Best baby products in India | infant care products online chicco india";
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		System.out.println("Expected Title : "+expTitle);
		
		if(actualTitle.equalsIgnoreCase(expTitle))
		{
			System.out.println("Title Same");
		}
		else
		{
			System.out.println("Title not same");
		}
		
	}
	
	public void windowHandle()
	{
		String parenWindow=driver.getWindowHandle();
		driver.switchTo().window(parenWindow);
	}
	
}
