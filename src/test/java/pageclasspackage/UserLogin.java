package pageclasspackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class UserLogin extends ChiccoSetup{
	
	public UserLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="/html/body/div[1]/header/div[3]/div/nav/ul[2]/li[4]/span/a/img")
	WebElement loginIcon;
	
	/*@FindBy (id="login-form-email")
	WebElement loginEmail;
	
	@FindBy (id="login-form-password")
	WebElement loginPswd;   */
	
	@FindBy (id="login-button")
	WebElement loginButton;
	
	public void loginLinkClick()
	{
		loginIcon.click();
	}
	
	/*
	public void enterUsername(String userName)
	{
		loginEmail.sendKeys(userName);
	}
	
	public void enterPassword(String passWord)
	{
		loginPswd.sendKeys(passWord);
	}
	
	public void loginButtonClick()
	{
		loginButton.click();
	}
*/
}
