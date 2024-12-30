package pageclasspackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclasspackage.ChiccoSetup;

public class HygieneAndSafety extends ChiccoSetup{
	
	public HygieneAndSafety(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText="Hygiene & Safety")
	WebElement hygieneSafetyLink;
	
	@FindBy (id="sortby_price")
	WebElement dropDownSortBy;
	
	
	@FindBy (linkText="Combo- Laundry Detergent Bottle 1000ML FRAGR2 IN + Laundry Detergent Bottle 1000ML FRAGR1 IN")
	//@FindBy (xpath="//div[@id='maincontent']/section[2]/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div[2]/a[2]")
	WebElement  firstItemLink;
	
	public void hygieneLinkClick()
	{
		hygieneSafetyLink.click();
	}

	public void dropDownSortby()
	{
		Select s=new Select(dropDownSortBy);
		s.selectByVisibleText("Top Sellers");
	}
	
	public void itemScreenshot() throws IOException
	{
		 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(f, new File("./Screenshot/pagescreenshot.png"));
	}
	public void clickItem()
	{
		firstItemLink.click();
	}

}
