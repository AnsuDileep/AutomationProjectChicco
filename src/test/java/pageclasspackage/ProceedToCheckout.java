package pageclasspackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclasspackage.ChiccoSetup;

public class ProceedToCheckout extends ChiccoSetup{
	
	public ProceedToCheckout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText="Secure Checkout")
	WebElement CheckoutButton;
	
	@FindBy (id="shippingFirstNamedefault")
	WebElement addressFirstName;
	
	@FindBy (id="shippingLastNamedefault")
	WebElement addressLastname;
	
	@FindBy (id="shippingAddressOnedefault")
	WebElement shippingAddress1;
	
	@FindBy (id="shippingAddressTwodefault")
	WebElement shippingAddress2;
	
	@FindBy (id="shippingCountrydefault")
	WebElement addressCountry;
	
	@FindBy (id="shippingStatedefault")
	WebElement addressState;
	
	@FindBy (id="shippingAddressCitydefault")
	WebElement addressCity;
	
	@FindBy (id="shippingZipCodedefault")
	WebElement addressPincode;
	
	@FindBy (id="shippingPhoneNumberdefault")
	WebElement addressMobilenumber;
	
	@FindBy (id="checkout-shipping-address")
	WebElement saveAndNextPaymentButton;
	
	@FindBy (id="email")
	WebElement emailField;
	
	@FindBy (id="checkout-place-order")
	WebElement placeOrderButton;
	
	
	public void secureCheckout()
	{
		CheckoutButton.click();
	}
	
	public void address()
	{
		
		addressFirstName.clear();
		addressFirstName.sendKeys("Ansu");
		
		addressLastname.clear();
		addressLastname.sendKeys("Sobha");
		
		shippingAddress1.clear();
		shippingAddress1.sendKeys("Garden Court Apartments,Aroor");
		
		shippingAddress2.clear();
		shippingAddress2.sendKeys("Sneha Nagar");
		
		//addressCountry.clear();
		Select country=new Select(addressCountry);
		country.selectByVisibleText("India");
		
		//addressState.clear();
		Select state=new Select(addressState);
		state.selectByValue("Kerala");
		
		addressCity.clear();
		addressCity.sendKeys("Kochi");
		
		addressPincode.clear();
		addressPincode.sendKeys("682324");
		
		addressMobilenumber.clear();
		addressMobilenumber.sendKeys("9400540668");
		
			
	}
	
	public void paymentProceed()
	{
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,600)");
		saveAndNextPaymentButton.click();
	}
	
	public void placeOrder()
	{
		emailField.clear();
		emailField.sendKeys("ansu.s100@gmail.com");
		placeOrderButton.click();
	}
	
	

}
