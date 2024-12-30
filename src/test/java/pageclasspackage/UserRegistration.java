package pageclasspackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class UserRegistration extends ChiccoSetup{
	
	public UserRegistration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="/html/body/div[1]/header/div[3]/div/nav/ul[2]/li[4]/span/a/img")
	WebElement userIcon;
	
	@FindBy (id="register-tab")
	WebElement createAccountButton;
	
	@FindBy (id="registration-form-fname")
	WebElement firstNameField;
	
	@FindBy (id="registration-form-lname")
	WebElement lastNameField;
	
	@FindBy (id="registration-form-phone")
	WebElement phoneField;
	
	@FindBy (id="registration-form-email")
	WebElement emailField;
	
	@FindBy (id="registration-form-email-confirm")
	WebElement confirmEmailField;
	
	@FindBy (id="baby-registration-form-name")
	WebElement babyNameField;
	
	@FindBy (id="baby-registration-form-age")
	WebElement babyAgeField;
	
	@FindBy (xpath="//*[@id=\"baby-registry-account\"]/div[3]/div/label[3]/span")
	WebElement girlRadioButton;
	
	@FindBy (id="registration-form-password")
	WebElement passwordField;
	
	@FindBy (id="registration-form-password-confirm")
	WebElement confirmPswdField;
	
	@FindBy (id="register-button")
	WebElement signUpButton;
	
	
	public void userIconClick()
	{
		userIcon.click();
	}
	
	public void createAccountClick()
	{
		createAccountButton.click();
	}
	
	public void registrationForm()
	{
		firstNameField.sendKeys("Ansu");
		lastNameField.sendKeys("Sobha");
		phoneField.sendKeys("9400540668");
		emailField.sendKeys("ansu.s100@gmail.com");
		confirmEmailField.sendKeys("ansu.s100@gmail.com");
		babyNameField.sendKeys("Swaratmika");
		babyAgeField.sendKeys("04-01-2022");
		girlRadioButton.click();
		passwordField.sendKeys("Chicco#chicco123");
		confirmPswdField.sendKeys("Chicco#chicco123");
		
	}

	public void scrollDownSignUp()
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollintoView", signUpButton);
	}
	public void signUpClick()
	{
		signUpButton.click();
	}
}
