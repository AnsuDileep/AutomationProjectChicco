package pageclasspackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspackage.ChiccoSetup;

public class LoginPage extends ChiccoSetup{
	
	  // Locators for the login page elements using @FindBy annotation
    @FindBy(id="login-form-email")
    private WebElement usernameField;
    
    @FindBy(id="login-form-password")
    private WebElement passwordField;
    
    @FindBy(id="login-button")
    private WebElement loginButton;
    
    // Constructor to initialize WebDriver and PageFactory
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // Initialize elements using PageFactory
        PageFactory.initElements(driver, this);
    }

    // Method to enter username
    public void enterUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Method to click the login button
    public void clickLoginButton() {
        loginButton.click();
    }

    // Method to log in using username and password
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
	



